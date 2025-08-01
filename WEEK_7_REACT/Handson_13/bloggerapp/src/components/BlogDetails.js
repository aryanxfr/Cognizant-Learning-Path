
function BlogDetails() {
  const blogs=[
    {title:'React Learning',author:'Stephen Biz',content:'Welcome to learning React!'},
    {title:'Installation',author:'Schwezdenier',content:'You can install React from npm.'}
  ];
  return (
    <div>
      <h1>Blog Details</h1>
      {blogs.map((blog, index) => (
        <div key={index}>
          <h1>{blog.title}</h1>
          <p><b>{blog.author}</b></p>
          <p>{blog.content}</p>
        </div>
      ))}
    </div>
  );
}

export default BlogDetails;
