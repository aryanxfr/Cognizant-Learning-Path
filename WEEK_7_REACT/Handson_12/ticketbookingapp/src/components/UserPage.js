function UserPage({ handleLogout }) {
  return (
    <div>
      <h1 style={styles.heading}>Welcome User</h1>
      <p style={styles.message}>You can now book your tickets!</p>
      <br /><br />
      <button style={styles.logoutBtn} onClick={handleLogout}>Logout</button>
    </div>
  );
}

const styles={
  heading:{
    fontSize:'28px',
    color:'#333',
    marginBottom:'20px'
  },
  message:{
    fontSize:'18px',
    color:'#444'
  },
  bookBtn: {
    padding:'10px 25px',
    fontSize:'16px',
    backgroundColor:'#007bff',
    color:'white',
    border:'none',
    borderRadius:'6px',
    cursor:'pointer',
    marginTop:'15px'
  },
  logoutBtn:{
    padding:'8px 18px',
    fontSize:'14px',
    backgroundColor: '#dc3545',
    color:'white',
    border:'none',
    borderRadius:'6px',
    cursor:'pointer'
  }
};

export default UserPage;
