// ... (Previous code remains unchanged)

function showChargesList() {
    let chargesWindow = window.open('', 'Seminar Charges', 'width=600,height=400');
    let html = `
      <html>
        <head>
          <title>Seminar Charges</title>
          <style>
            /* CSS styles for the list */
            table {
              width: 100%;
              border-collapse: collapse;
            }
            th, td {
              border: 1px solid #ddd;
              padding: 8px;
              text-align: left;
            }
            th {
              background-color: #f2f2f2;
            }
          </style>
        </head>
        <body>
          <h2>Seminar Level Charges (In Rs)</h2>
          <table>
            <tr>
              <th>Seminar Level</th>
              <th>Charges (Rs)</th>
            </tr>
            <tr>
              <td>SOA Introductory</td>
              <td>2500</td>
            </tr>
            <tr>
              <td>SOA Intermediate</td>
              <td>3500</td>
            </tr>
            <tr>
              <td>SOA Advanced</td>
              <td>6000</td>
            </tr>
            <!-- Add other seminar levels and charges similarly -->
            <tr>
              <td>Business Intelligence Advanced</td>
              <td>10000</td>
            </tr>
          </table>
        </body>
      </html>
    `;
  
    chargesWindow.document.write(html);
  }
  