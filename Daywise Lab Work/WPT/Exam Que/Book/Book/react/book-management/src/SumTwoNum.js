import React, { useState } from 'react';

const SumTwoNum = () => {
  const [num1, setNum1] = useState(0);
  const [num2, setNum2] = useState(0);
  const [sum, setSum] = useState(0);

  const calculateSum = () => {
    setSum(num1 + num2);
  };

  return (
    <div>
      <input type="number" value={num1} onChange={(e) => setNum1(+e.target.value)} />
      <input type="number" value={num2} onChange={(e) => setNum2(+e.target.value)} />
      <button onClick={calculateSum}>Calculate Sum</button>
      <p>Sum: {sum}</p>
    </div>
  );
};

export default SumTwoNum;
