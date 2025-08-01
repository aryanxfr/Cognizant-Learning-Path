import FlightList from './FlightList';

function GuestPage({handleLogin}){
  return (
    <div>
      <h1 style={styles.heading}>Welcome Guest</h1>
      <FlightList />
      <p style={styles.note}>Login to book your flight</p>
      <button style={styles.button} onClick={handleLogin}>Login</button>
    </div>
  );
}

const styles={
  heading:{
    fontSize:'28px',
    color:'#333',
    marginBottom:'20px'
  },
  note:{
    margin:'20px 0',
    fontSize:'16px',
    color:'#555'
  },
  button:{
    padding:'10px 20px',
    backgroundColor: '#28a745',
    border:'none',
    color:'white',
    fontSize:'16px',
    cursor:'pointer',
    borderRadius:'6px'
  }
};

export default GuestPage;
