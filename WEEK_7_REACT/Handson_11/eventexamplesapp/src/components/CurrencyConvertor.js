import React, { useState } from 'react';

function CurrencyConvertor() {
  const [amount, setAmount] = useState('');

  const handleSubmit = (e) => {
    e.preventDefault();
    const euro = parseFloat(amount) * 0.010;
    if (isNaN(euro)) {
      alert("Please enter a valid amount");
      return;
    }
    alert(`Converting to Euro Amount is €${euro.toFixed(2)}`);
  };

  return (
    <form onSubmit={handleSubmit} style={{ marginTop: '20px' }}>
      <div style={{ marginBottom: '10px', display: 'flex', alignItems: 'center', gap: '10px' }}>
        <label style={{ width: '80px' }}>Amount: </label>
        <input
          type="text"
          value={amount}
          onChange={(e) => setAmount(e.target.value)}
          style={{ padding: '5px', width: '200px' }}
        />
      </div>

      <div style={{ display: 'flex', alignItems: 'flex-start', gap: '10px' }}>
        <label style={{ marginTop: '5px', width: '80px' }}>Currency: </label>
        <div style={{ display: 'flex', flexDirection: 'column', alignItems: 'center' }}>
          <textarea
            value="Euro"
            readOnly
            style={{ width: '200px', height: '40px', resize: 'none', padding: '5px' }}
          />
          <button
            type="submit"
            style={{ marginTop: '5px', padding: '6px 12px', width: '100px' }}
          >
            Submit
          </button>
        </div>
      </div>
    </form>
  );
}

export default CurrencyConvertor;
