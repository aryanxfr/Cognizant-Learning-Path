
function BookDetails() {
  const books = [
    {title:'Master React',price:670},
    {title:'Deep Dive into Angular 11',price:800},
    {title:'Mongo Essentials',price:450}
  ];
  return (
    <div>
      <h1>Book Details</h1>
      {books.map((book, index) => (
        <div key={index}>
          <strong>{book.title}</strong>
          <p><strong>{book.price}</strong></p>
        </div>
      ))}
    </div>
  );
}

export default BookDetails;
