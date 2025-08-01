import CourseDetails from './components/CourseDetails';
import BookDetails from './components/BookDetails';
import BlogDetails from './components/BlogDetails';
import './App.css';

function App() {
  return (
    <div className="container">
      <div className="section left-align">
        <CourseDetails />
      </div>
      <div className="divider" />
      <div className="section">
        <BookDetails />
      </div>
      <div className="divider" />
      <div className="section left-align">
        <BlogDetails />
      </div>
    </div>
  );
}

export default App;
