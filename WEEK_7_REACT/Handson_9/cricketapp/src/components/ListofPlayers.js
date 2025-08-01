import React from "react";

export const players = [
  {name: "Sachin", score: 95},
  {name: "Dhoni", score: 45},
  {name: "Virat", score: 80},
  {name: "Rohit", score: 60},
  {name: "Rahul", score: 71},
  {name: "Shami", score: 65},
  {name: "Bumrah", score: 85},
  {name: "Raina", score: 50},
  {name: "Yuvraj", score: 90},
  {name: "Ashwin", score: 67},
  {name: "Jadeja", score: 55}
];

export const players70 = players.filter(item => item.score <= 70);

export default function ListofPlayers() {
  return (
    <div>
      <h1>List of Players</h1>
      <ul>
        {players.map((item, index) => (
          <li key={index}>
            Mr.{item.name} <span>{item.score}</span>
          </li>
        ))}
      </ul>

      <hr />

      <h1>List of Players having Scores Less than 70</h1>
      <ul>
        {players70.map((item, index) => (
          <li key={index}>
            Mr.{item.name} <span>{item.score}</span>
          </li>
        ))}
      </ul>
    </div>
  );
}
