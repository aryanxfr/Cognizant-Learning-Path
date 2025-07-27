import React from "react";
import '../component/CountPeople.css'

class CountPeople extends React.Component
{
    constructor(){
    super();
    this.state={
        entrycount:0,
        exitcount:0,
        c:0,
        }
        this.updateEntry=this.updateEntry.bind(this)
        this.updateExit=this.updateExit.bind(this)
    }
    updateEntry() {
        this.setState((prevState,props)=>{
            return {entrycount: prevState.entrycount+1}
        })
    }
    updateExit(){
        this.setState((prevState)=>{
            return {exitcount:prevState.exitcount+1}
        })
    }
    render(){
    return(
      <div>
        <div className="container">
          <div>
            <button className="button" onClick={this.updateEntry}>
              Login
            </button>
            <span className="message">{this.state.entrycount} People Entered!!!</span>
          </div>

          <div>
            <button className="button" onClick={this.updateExit}>
              Exit
            </button>
            <span className="message">{this.state.exitcount} People Left!!!</span>
          </div>
        </div>
      </div>
    );
  }
}
export default CountPeople