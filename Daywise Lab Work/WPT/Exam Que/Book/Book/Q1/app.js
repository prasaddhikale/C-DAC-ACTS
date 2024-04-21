const express = require("express");
const bodyParser = require("body-parser");
const cors = require("cors");

const app = express();
const port = 3000;

app.use(cors());

// In-memory array to store books
const books = [];

app.use(bodyParser.json());
app.use(bodyParser.urlencoded({ extended: true }));

// Middleware to log requests
app.use((req, res, next) => {
  console.log(`${req.method} ${req.url}`);
  next();
});

// POST endpoint to save book details
app.post("/books", (req, res) => {
  const { name, author, price } = req.body;

  // Generate a new Id for the book
  const id = books.length + 1;

  // Create a new Book object
  const newBook = {
    id,
    name,
    author,
    price,
  };

  // Save the new book to the in-memory array
  books.push(newBook);

  // Return the newly added book in the response
  res.status(201).json(newBook);
});

// GET endpoint to retrieve all books
app.get("/books", (req, res) => {
  res.json(books);
});

// GET endpoint to retrieve a specific book by ID
app.get("/books/:id", (req, res) => {
  const bookId = parseInt(req.params.id);

  const book = books.find((b) => b.id === bookId);

  if (book) {
    res.json(book);
  } else {
    res.status(404).json({ message: "Book not found" });
  }
});

// Simple HTML form to interact with the API
app.get("/add-book", (req, res) => {
  res.send(`
        <form method="post" action="/books">
            <label for="name">Book Name:</label>
            <input type="text" name="name" required><br>

            <label for="author">Author:</label>
            <input type="text" name="author" required><br>

            <label for="price">Price:</label>
            <input type="number" name="price" required><br>

            <button type="submit">Add Book</button>
        </form>
    `);
});

app.listen(port, () => {
  console.log(`Server is running on http://localhost:${port}`);
});
