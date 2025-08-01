import React from "react";
import ListofPlayers from "./components/ListofPlayers";
import { players } from "./components/ListofPlayers";
import {OddPlayers,EvenPlayers,IndianPlayers,ListofIndianPlayers} from "./components/IndianPlayers";

function App() {
  var flag = true;
  if (flag===true) {
    return (
      <div>
        <ListofPlayers />
      </div>
    );
  } else {
    return (
      <div>
        {OddPlayers(players)}
        <hr />
        {EvenPlayers(players)}
        <hr />
        <ListofIndianPlayers IndianPlayers={IndianPlayers} />
      </div>
    );
  }
}

export default App;
