import React from "react";
class Posts extends React.Component{
    constructor(props){
        super(props);
        this.state={
            posts:[],
            error:null
        }
    }
    loadPosts=()=>{
        fetch('https://jsonplaceholder.typicode.com/posts')
        .then((response)=>{
            if(!response.ok){
                throw new Error("Failed to fetch posts")
            }
            return response.json();
        })
        .then((data)=>{
            this.setState({posts:data})
        })
        .catch((error)=>{
            this.setState({error});
            alert("Error while fetching posts:" + error.message);
        })
    }
    componentDidMount(){
        this.loadPosts();
    }
    render(){
        return(
            <div>
                <h1 style={{ textAlign: 'center'}}>Blog Posts</h1>
                {this.state.posts.map((post) => (
                <div key={post.id} style={{border: '1px solid #ccc', padding: '10px', margin: '10px auto', maxWidth: '600px' }}>
                    <h3>{post.title}</h3>
                    <p>{post.body}</p>
                </div>
                ))}
            </div>
        )
    }
    componentDidCatch(error,info){
        alert("Error occured while rendering:" + error.toString());
    }
}

export default Posts;