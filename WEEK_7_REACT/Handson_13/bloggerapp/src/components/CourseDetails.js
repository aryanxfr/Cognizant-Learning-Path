
function CourseDetails() {
  const courses=[
    {name:'Angular',date:'4/5/2021'},
    {name:'React', date:'6/3/20201'}
  ];
  return (
    <div>
      <h1>Course Details</h1>
      {courses.map((course, index) => (
        <div key={index}>
          <h1>{course.name}</h1>
          <strong><p>{course.date}</p></strong>
        </div>
      ))}
    </div>
  );
}

export default CourseDetails;
