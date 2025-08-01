
export function OddPlayers([first, ,third, ,fifth, ,seven, ,nine]) {
  return (
    <div>
      <h1>Odd Players</h1>
      <ul>
        <li>First: {first.name}</li>
        <li>Third: {third.name}</li>
        <li>Fifth: {fifth.name}</li>
        <li>Seventh: {seven.name}</li>
        <li>Ninth: {nine.name}</li>
      </ul>
    </div>
  );
}

export function EvenPlayers([, second, ,fourth, ,sixth, ,eight, ,ten]) {
  return (
    <div>
      <h1>Even Players</h1>
      <ul>
        <li>Second: {second.name}</li>
        <li>Fourth: {fourth.name}</li>
        <li>Sixth: {sixth.name}</li>
        <li>Eighth: {eight.name}</li>
        <li>Tenth: {ten.name}</li>
      </ul>
    </div>
  );
}

export const T20Players = ["First Player", "Second Player", "Third Player"];
export const RanjiTrophyPlayers = ["Fourth Player", "Fifth Player", "Sixth Player"];
export const IndianPlayers = [...T20Players, ...RanjiTrophyPlayers];

export function ListofIndianPlayers({ IndianPlayers }) {
  return (
    <div>
      <h1>List of Indian Players Merged:</h1>
      <ul>
        {IndianPlayers.map((player, index) => (
          <li key={index}>{player}</li>
        ))}
      </ul>
    </div>
  );
}
