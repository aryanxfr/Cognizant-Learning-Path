import { useState } from "react";

function Counter(){
    const[count,setCount]=useState(0);
    
    const increment=()=>{
        setCount(count+1)
        alert(`Hello member ${count+1}`)
    }
    const decrement=()=>{
        setCount(count-1);
    }
    return(
        <div>
            <p>{count}</p>
            <button onClick={increment}>Increment</button>
            <br/>
            <button onClick={decrement}>Decrement</button>
        </div>
    )
}

export default Counter