import { Component } from "react";

class Register extends Component{
    constructor(){
        super()
        this.state={
            fullName:'',
            email:'',
            password:'',
            errors:{
                fullName:'',
                email:'',
                password:'',
            }
        }
    }
    validateForm=(errors)=>{
        let valid=true
        Object.values(errors).forEach(val=>{
            if(val.length>0){
                valid=false
            }
        })
        return valid
    }

    handleChange=(e)=>{
        const{name,value}=e.target
        let errors=this.state.errors;
        switch(name){
            case 'fullName':
                errors.fullName=value.length < 5 ?'Full Name must be 5 characters long!':''
                break;
            case 'email':
                const validEmailRegex=RegExp(/^(([^<>()[\]\\.,;:\s@"]+(\.[^<>()[\]\\.,;:\s@"]+)*)|(".+"))@(([^<>()[\]\\.,;:\s@"]+\.)+[^<>()[\]\\.,;:\s@"]{2,})$/)
                errors.email=validEmailRegex.test(value) ?'':'Email is not valid!'
                break;
            case 'password':
                errors.password=value.length < 8 ?'Password must be 8 characters long':''
                break;
            default:
                break;
        }
        this.setState({[name]:value,errors})
    }
    handleSubmit = (event) => {
    event.preventDefault();
    const {fullName,email,password,errors}=this.state;
    let newErrors={...errors}
    if (fullName.trim().length<5){
        newErrors.fullName="Full Name must be 5 characters long!";
    }
    if (!/^(([^<>()[\]\\.,;:\s@"]+(\.[^<>()[\]\\.,;:\s@"]+)*)|(".+"))@(([^<>()[\]\\.,;:\s@"]+\.)+[^<>()[\]\\.,;:\s@"]{2,})$/.test(email)) {
        newErrors.email="Email is not valid!";
    }
    if (password.trim().length<8) {
        newErrors.password="Password must be 8 characters long";
    }

    this.setState({errors:newErrors},()=>{
        if(this.validateForm(this.state.errors)) {
            alert('Valid Form');
        }else{
        if(this.state.errors.fullName!==''){
            alert(this.state.errors.fullName);
        }
        if(this.state.errors.email!==''){
            alert(this.state.errors.email);
        }   
        if(this.state.errors.password!==''){
            alert(this.state.errors.password);
        }
    }
    })
    
  }
  render(){
    return(
      <div style={{textAlign:'center', marginTop:'100px'}}>
        <h1 style={{ color:'red',fontWeight:'bold'}}>
          Register Here!!!
        </h1>
        <form onSubmit={this.handleSubmit}>
          <table align="center">
            <tbody>
              <tr>
                <td>Name:</td>
                <td>
                  <input
                    type="text"
                    name="fullName"
                    onChange={this.handleChange}
                  />
                </td>
              </tr>
              <tr>
                <td>Email:</td>
                <td>
                  <input
                    type="text"
                    name="email"
                    onChange={this.handleChange}
                  />
                </td>
              </tr>
              <tr>
                <td>Password:</td>
                <td>
                  <input
                    type="password"
                    name="password"
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
    );
  }
}
export default Register

