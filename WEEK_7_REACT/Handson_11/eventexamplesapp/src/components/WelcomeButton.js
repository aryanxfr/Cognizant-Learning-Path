function WelcomeButton(){
    const welcome=(message)=>{
        alert(message)
    }
    return(
        <button onClick={()=>welcome("welcome")}>Say Welcome</button>
    )
}
export default WelcomeButton