// AccountList.js
import React from 'react';

const AccountList = ({ accountArray, handleEdit, handleDelete }) => {
  return (
    <div>
      <h2>Account List</h2>
      {accountArray.length === 0 ? (
        <p>No accounts to display.</p>
      ) : (
        <table className="table">
          <thead>
            <tr>
              <th>Account ID</th>
              <th>Account Name</th>
              <th>Account Type</th>
              <th>Balance</th>
              <th>Creation Date</th>
              <th>Action</th>
            </tr>
          </thead>
          <tbody>
            {accountArray.map((account, index) => (
              <tr key={index}>
                <td>{account.accountId}</td>
                <td>{account.accountName}</td>
                <td>{account.accountType}</td>
                <td>{account.balance}</td>
                <td>{account.creationDate}</td>
                <td>
                  
                  <button
                    className="btn btn-danger btn-sm"
                    onClick={() => handleDelete(index)}
                  >
                    Delete
                  </button>
                </td>
              </tr>
            ))}
          </tbody>
        </table>
      )}
    </div>
  );
};

export default AccountList;
