import React from 'react';
import {useParams} from 'react-router-dom';
import trainersMock from './Trainersmock';

function TrainerDetail() {
  const {id} = useParams();
  const trainer = trainersMock.find(t => t.trainerId === id);
  return (
    <div>
      <h2>{trainer.name} - {trainer.technology}</h2>
      <p><strong></strong> {trainer.email}</p>
      <p><strong></strong> {trainer.phone}</p>
      <ul>
        {trainer.skills.map((skill,index)=>(
            <li key={index}>{skill}</li>
        ))}
      </ul>
    </div>
  );
}

export default TrainerDetail;