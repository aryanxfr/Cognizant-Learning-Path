import { Component } from "react"

class ComplaintRegister extends Component{
    constructor(){
        super()
        this.state={
            ename:'',
            complaint:'',
        }
    }

    handleChange=(e)=>{
        this.setState({[e.target.name]:e.target.value})
    }

    handleSubmit=(e)=>{
        const randomID=Math.floor(Math.random()*100)+1
        const msg='Thanks ' + this.state.ename + '\n Your complaint was Submitted. \nTransaction ID is: '+ 
        randomID
        alert(msg)
        e.preventDefault()
    }

    render(){
        return(
            <div style={{textAlign:'center', marginTop:'30px'}}>
                <h1 style={{color:'red', fontWeight:'bold'}}>
                    Register your complaints here !!!
                </h1>
                <form onSubmit={this.handleSubmit}>
                    <table align="center">
                        <tbody>
                            <tr>
                                <td>Name:</td>
                                <td><input 
                                type="text"
                                name="ename"
                                value={this.state.ename}
                                onChange={this.handleChange}
                                />
                                </td>
                            </tr>
                            <tr>
                                <td>Complaint</td>
                                <td>
                                <textarea
                                name="complaint"
                                value={this.state.complaint}
                                onChange={this.handleChange}
                                />
                                </td>
                            </tr>
                            <tr>
                                <td colSpan="2" align="center">
                                    <button type="submit">Submit</button>
                                </td>
                            </tr>
                        </tbody>
                    </table>
                </form>
            </div>                
        )
    }
}

export default ComplaintRegister