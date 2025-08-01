function ClickAlert(){
    const handleClick=()=>{
        alert("I was clicked")
    }

    return(
        <button onClick={handleClick}>Click on me</button>
    )
}

export default ClickAlert