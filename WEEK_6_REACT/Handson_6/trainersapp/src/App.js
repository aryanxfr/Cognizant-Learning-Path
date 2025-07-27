import React from "react";
import {BrowserRouter,Routes,Route,Link} from 'react-router-dom';
import Home from "./Home";
import trainersMock from "./Trainersmock";
import TrainersList from "./TrainersList";
import TrainerDetail from "./TrainerDetail";

function App() {
  return (
    <BrowserRouter>
      <div>
        <h1>My Academy Trainers Page</h1>
        <nav>
          <Link to="/">Home</Link> | 
          <Link to="/trainers"> Show Trainers</Link>
        </nav>

        <Routes>
          <Route path="/" element={<Home />} />
          <Route path="/trainers" element={<TrainersList trainers={trainersMock} />} />
          <Route path="/trainer/:id" element={<TrainerDetail />} />
        </Routes>
      </div>
    </BrowserRouter>
  );
}

export default App;




