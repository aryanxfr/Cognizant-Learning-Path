import React, { useState } from 'react';
import GuestPage from './components/GuestPage';
import UserPage from './components/UserPage';

function App(){
  const [isLoggedIn, setIsLoggedIn]=useState(false);

  const handleLogin=()=>setIsLoggedIn(true);
  const handleLogout=()=>setIsLoggedIn(false);

  return (
    <div style={styles.container}>
      {isLoggedIn ? (
        <UserPage handleLogout={handleLogout} />
      ) : (
        <GuestPage handleLogin={handleLogin} />
      )}
    </div>
  );
}

const styles={
  container:{
    fontFamily:'Arial, sans-serif',
    textAlign:'center',
    marginTop:'80px',
    padding:'20px'
  }
};

export default App;
