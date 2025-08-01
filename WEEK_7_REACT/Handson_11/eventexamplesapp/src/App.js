
import React from "react";

import Counter from "./components/Counter";
import WelcomeButton from "./components/WelcomeButton";
import ClickAlert from "./components/ClickAlert";
import CurrencyConvertor from "./components/CurrencyConvertor";

function App(){
  return(
    <div style={{padding:'20px',fontFamily:'Arial'}}>
      <Counter/>
      <WelcomeButton/>
      <br/>
      <ClickAlert/>
      <br/>
      <h1 style={{color:'green'}}>Currency Convertor!!!</h1>
      <CurrencyConvertor/>
    </div>
  )
}

export default App