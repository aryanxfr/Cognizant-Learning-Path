function Office(){
    const office={
        name:"DBS",
        rent:50000,
        address:"Chennai",
        image:"https://images.pexels.com/photos/1957478/pexels-photo-1957478.jpeg"
  
    }
    return(
        <div style={{paddingLeft:"150px", paddingTop:"50px"}}>
            <img src={office.image} alt="Office" width="25%" height="25%"/>
            <h1>Name: {office.name}</h1>
            <h3 style={{color:office.rent<60000 ? "red": "green"}}>
                Rent: Rs. {office.rent}
            </h3>
            <h3>
                Address: {office.address}
            </h3>
        </div>
    )
}

export default Office