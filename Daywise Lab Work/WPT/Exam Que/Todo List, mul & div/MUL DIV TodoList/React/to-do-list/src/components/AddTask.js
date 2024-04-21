// AddTask.js
import React, { useState } from "react";


const AddTask = ({ onAddTask }) => {
  const [taskName, setTaskName] = useState("");
  const [duration, setDuration] = useState("");

  const handleAddList = () => {
    console.log("Task Name:", taskName);
    console.log("Duration:", duration);

    if (!taskName || !duration) {
      alert("Please enter both Task Name and Duration.");
      return;
    }

    onAddTask({ taskName, duration });
    setTaskName("");
    setDuration("");
  };

  return (
    <div>
      <form>
        <div className="mb-3">
          <label htmlFor="taskName" className="form-label">
            Task Name
          </label>
          <input
            type="text"
            className="form-control"
            id="taskName"
            value={taskName}
            onChange={(e) => setTaskName(e.target.value)}
          />
        </div>

        <div className="mb-3">
          <label htmlFor="duration" className="form-label">
            Duration
          </label>
          <input
            type="text"
            className="form-control"
            id="duration"
            value={duration}
            onChange={(e) => setDuration(e.target.value)}
          />
        </div>

        <button
          type="button"
          className="btn btn-primary"
          onClick={handleAddList}
        >
          Add List
        </button>
      </form>
      <table className="table mt-4">
        <thead>
          <tr>
            <th scope="col">Task Name</th>
            <th scope="col">Duration</th>
          </tr>
        </thead>
        <tbody>
          {tasks.map((task, index) => {
            console.log("Task Properties:", task);
            <tr key={index}>
              <td>{task.taskName}</td>
              <td>{task.duration}</td>
            </tr>;
          })}
        </tbody>
      </table>
    </div>
  );
};

export default AddTask;
