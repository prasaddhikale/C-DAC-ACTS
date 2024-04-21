import "bootstrap/dist/css/bootstrap.min.css";
import { useEffect, useState } from "react";
import "./app.css";
import AddTask from "./components/AddTask";
import TaskList from "./components/TaskList";

const App = () => {
  const [tasks, setTasks] = useState([]);

  useEffect(() => {
    const storedTasks = JSON.parse(localStorage.getItem("tasks")) || [];
    setTasks(storedTasks);
  }, []);

  const handleAddTask = (newTask) => {
    const updatedTasks = [...tasks, newTask];
    setTasks(updatedTasks);
    localStorage.setItem("tasks", JSON.stringify(updatedTasks));

    console.log("Updated Tasks:", updatedTasks);
  };
  return (
    <div className="container mt-4">
      <h1 className="mb-4">Task List</h1>

      <AddTask onAddTask={handleAddTask} tasks={tasks} />
      <TaskList />
    </div>
  );
};

export default App;
