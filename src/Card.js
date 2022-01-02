import { React, useEffect, useState } from "react";
import axios from "axios";

const Card = (props) => {
  let date = new Date();
  let dateFormat = `${date.getDate()}/
  ${date.getMonth() + 1}/
  ${date.getFullYear()}`;

  const saveClick = () => {
    async function saveData() {
      const response = await axios.post(
        `http://localhost:8080/weather/add/${props.state.cityName}`
      );

      console.log("Saved to database");
    }
    saveData();
  };

  return (
    <div
      style={{
        margin: "auto",
        width: "30%",
        borderRadius: "3px solid black",
        padding: "10px",
        textAlign: "center",
      }}
    >
      <div className="card" style={{ borderRadius: "3px solid black" }}>
        <img
          src="https://static.daktilo.com/sites/455/uploads/2021/11/07/sanliurfahavadurumu-1611640717.jpg"
          className="card-img-top"
          alt="..."
        />
        <div className="card-body">
          <h2 className="card-title">{props.state.cityName}</h2>
          <h4 className="card-text">Temp ={props.state.temp}</h4>
          <h4 className="card-text">Max Temp = {props.state.maxTemp}</h4>
          <h4 className="card-text">Min Temp = {props.state.minTemp}</h4>
          <h5 className="card-text">State = {props.state.state}</h5>
          <h6 className="card-text">{dateFormat}</h6>
          <a onClick={saveClick} className="btn btn-primary">
            Save to Database
          </a>
        </div>
      </div>
    </div>
  );
};

export default Card;
