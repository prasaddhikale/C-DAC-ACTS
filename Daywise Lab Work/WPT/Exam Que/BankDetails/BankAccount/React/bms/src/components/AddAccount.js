// AddAccount.js
import React, { useState } from 'react';

const AddAccount = ({ saveInfo }) => {
  const [accountInfo, setAccountInfo] = useState({
    accountId: '',
    accountName: '',
    accountType: 'saving',
    balance: '',
    creationDate: '',
  });

  const handleInputChange = (e) => {
    const { name, value } = e.target;
    setAccountInfo({ ...accountInfo, [name]: value });
  };

  const handleSubmit = () => {
    // Validation
    if (
      !accountInfo.accountId ||
      !accountInfo.accountName ||
      !accountInfo.accountType ||
      isNaN(accountInfo.balance) ||
      accountInfo.balance < 5000 ||
      !accountInfo.creationDate
    ) {
      alert('Please fill all fields correctly.');
      return;
    }

    // Save info
    saveInfo(accountInfo);

    // Clear form fields
    setAccountInfo({
      accountId: '',
      accountName: '',
      accountType: 'saving',
      balance: '',
      creationDate: '',
    });
  };

  return (
    <div>
      <h2>Add New Account</h2>
      <form>
        <div className="form-group">
          <label htmlFor="accountId">Account ID</label>
          <input
            type="text"
            className="form-control"
            id="accountId"
            name="accountId"
            value={accountInfo.accountId}
            onChange={handleInputChange}
            required
          />
        </div>
        <div className="form-group">
          <label htmlFor="accountName">Account Name</label>
          <input
            type="text"
            className="form-control"
            id="accountName"
            name="accountName"
            value={accountInfo.accountName}
            onChange={handleInputChange}
            required
          />
        </div>
        <div className="form-group">
          <label htmlFor="accountType">Account Type</label>
          <select
            className="form-control"
            id="accountType"
            name="accountType"
            value={accountInfo.accountType}
            onChange={handleInputChange}
            required
          >
            <option value="saving">Saving</option>
            <option value="current">Current</option>
          </select>
        </div>
        <div className="form-group">
          <label htmlFor="balance">Balance</label>
          <input
            type="number"
            className="form-control"
            id="balance"
            name="balance"
            value={accountInfo.balance}
            onChange={handleInputChange}
            required
          />
        </div>
        <div className="form-group">
          <label htmlFor="creationDate">Creation Date</label>
          <input
            type="date"
            className="form-control"
            id="creationDate"
            name="creationDate"
            value={accountInfo.creationDate}
            onChange={handleInputChange}
            required
          />
        </div>
        <button
          type="button"
          className="btn btn-primary"
          onClick={handleSubmit}
        >
          Save Info
        </button>
      </form>
    </div>
  );
};

export default AddAccount;
