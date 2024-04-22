#!/bin/bash

# Create the file and write content
echo "Java is great" > cdac.txt
echo "Scripting is easy" >> cdac.txt
echo "I love Java" >> cdac.txt
echo "Python is good, too" >> cdac.txt
echo "Hello, Java World!" >> cdac.txt

# Count lines that do not contain the word "Java"
non_java_lines=$(grep -v "Java" cdac.txt | wc -l)

# Print the result
echo "Number of lines not containing the word Java: $non_java_lines"
#!/bin/bash
