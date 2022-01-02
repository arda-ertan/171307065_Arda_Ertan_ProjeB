import Card from "./Card";
import SearchBar from "./SearchBar";
import { React, useEffect, useState } from "react";
import axios from "axios";

const App = () => {
  const [state, setState] = useState({
    cityName: "",
    country: "",
    temp: "",
    maxTemp: "",
    minTemp: "",
    state: "",
    date: "",
    id: "",
  });

  const [cities, setCities] = useState([]);
  const [city, setCity] = useState("Istanbul");

  async function fetchCity() {
    const cityResponse = await axios.get(`http://localhost:8080/cities/getAll`);
    let cityData = cityResponse.data;
    setCities(cityData);
  }

  async function fetchData() {
    const response = await axios.get(
      `http://localhost:8080/weather/get/${city}`
    );
    let weather = response.data;
    setState({
      cityName: weather.cityName,
      country: weather.country,
      temp: weather.temp,
      maxTemp: weather.maxTemp,
      minTemp: weather.minTemp,
      state: weather.state,
      date: weather.date,
      id: weather.id,
    });
  }

  useEffect(() => {
    fetchData();
    fetchCity();
  }, [city]);

  const getCityName = (params) => {
    const tempCity = params;
    console.log(tempCity);
    setCity(tempCity);
  };
  const getSearchBarCityName = (params) => {
    const cityName = params;
    console.log(params);
    setCity(cityName);
  };

  return (
    <div>
      <SearchBar
        cities={cities}
        getCity={getCityName}
        getSearchbar={getSearchBarCityName}
      />

      <Card state={state} />
    </div>
  );
};

export default App;
