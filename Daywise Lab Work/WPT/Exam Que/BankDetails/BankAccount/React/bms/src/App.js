// App.js
import React, { useState } from 'react';
import Navbar from './components/Navbar';
import Footer from './components/Footer';
import AccountList from './components/AccountList';
import AddAccount from './components/AddAccount';
import 'bootstrap/dist/css/bootstrap.min.css';
function App() {
  const [accountArray, setAccountArray] = useState([]);
  const [editIndex, setEditIndex] = useState(null);

  const saveInfo = (accountInfo) => {
    if (editIndex !== null) {
      // Update existing account
      const updatedAccounts = [...accountArray];
      updatedAccounts[editIndex] = accountInfo;
      setAccountArray(updatedAccounts);
      setEditIndex(null);
    } else {
      // Add new account
      setAccountArray([...accountArray, accountInfo]);
    }
  };

 

  const handleDelete = (index) => {
    const updatedAccounts = [...accountArray];
    updatedAccounts.splice(index, 1);
    setAccountArray(updatedAccounts);
  };

  return (
    <div>
      <Navbar />

      <div className="container mt-4">
        <div className="row">
          <div className="col-md-6">
            <AddAccount saveInfo={saveInfo} editAccount={accountArray[editIndex]} />
          </div>
          <div className="col-md-6">
            <hr />
            <AccountList
              accountArray={accountArray}
             
              handleDelete={handleDelete}
            />
          </div>
        </div>
      </div>

      <Footer />
    </div>
  );
}

export default App;
