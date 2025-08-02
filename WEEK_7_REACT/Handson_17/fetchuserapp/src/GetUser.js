import { Component } from 'react';

class Getuser extends Component {
  constructor(){
    super();
    this.state={
      person:null,
      loading:true
    };
  }

  async componentDidMount(){
    const url="https://api.randomuser.me/";
    const response=await fetch(url);
    const data=await response.json();
    this.setState({person:data.results[0], loading:false});
    console.log(data.results[0]);
  }

  render(){
    if(this.state.loading){
      return <h2>Loading</h2>;
    }
    if (!this.state.person){
      return <h2>No user data found!</h2>;
    }
    const {title,first}=this.state.person.name;
    const image=this.state.person.picture.large;

    return(
      <div style={{textAlign:'center',marginTop:'30px'}}>
        <h2>{title} {first}</h2>
        <img src={image} alt="User" style={{width:'200px',height:'200px', objectFit:'cover'}}/>
      </div>
    );
  }
}

export default Getuser;
