import Office from "./OfficeCard";

function App(){
  const heading= <h1 style={{paddingLeft:"150px", paddingTop:"50px"}}>Office Space, at Affordable Range</h1>

  return(
    <div style={{padding:"20px",fontFamily:"Arial"}}>
      {heading}
      <Office/>
    </div>
  )
}

export default App