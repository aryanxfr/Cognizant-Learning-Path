import React from "react"

export class Cart extends React.Component{
    render() {
        return (
             <table border="1" style={{color:"green",margin:"0 auto"}}>
                <thead>
                    <tr>
                        <th>Name</th>
                        <th>Price</th>
                    </tr>
                </thead>
                <tbody>
                    {this.props.item.map((item)=>{
                        return(
                            <tr>
                                <td>{item.itemname}</td>
                                <td>{item.price}</td>
                            </tr>
                        )
                    })}
                </tbody>
             </table>
        );
    }
}



