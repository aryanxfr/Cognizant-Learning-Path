import React from 'react';

function FlightList(){
  const flights=[
    {id: 1,from:'Delhi',to:'Mumbai',time:'10:00 AM'},
    {id: 2,from:'Bangalore',to:'Chennai',time:'2:30 PM'},
    {id: 3,from:'Kolkata',to:'Goa',time:'6:45 PM'},
  ];

  return (
    <div style={styles.listContainer}>
      <h2 style={styles.title}>Available Flights</h2>
      <ul style={styles.list}>
        {flights.map(flight => (
          <li key={flight.id} style={styles.item}>
             {flight.from} → {flight.to} at {flight.time}
          </li>
        ))}
      </ul>
    </div>
  );
}

const styles={
  listContainer:{
    marginBottom:'20px'
  },
  title:{
    fontSize:'20px',
    color:'#555',
    marginBottom:'10px'
  },
  list:{
    listStyle:'none',
    padding:0
  },
  item:{
    fontSize:'16px',
    margin:'10px 0'
  }
};

export default FlightList;
