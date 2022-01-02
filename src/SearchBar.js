import { React, useEffect, useState } from "react";

const SearchBar = (props) => {
  const [cityName, setCityName] = useState("");

  function getCity(params) {
    props.getCity(params);
  }

  function getSearchbar(params) {
    props.getSearchbar(params);
  }
  return (
    <nav className="navbar navbar-expand-lg navbar-light bg-light">
      <div className="container-fluid">
        <a className="navbar-brand">Main Menu</a>
        <button
          className="navbar-toggler"
          type="button"
          data-bs-toggle="collapse"
          data-bs-target="#navbarSupportedContent"
          aria-controls="navbarSupportedContent"
          aria-expanded="false"
          aria-label="Toggle navigation"
        >
          <span className="navbar-toggler-icon"></span>
        </button>
        <div className="collapse navbar-collapse" id="navbarSupportedContent">
          <ul className="navbar-nav me-auto mb-2 mb-lg-0">
            <li className="nav-item">
              <a className="nav-link active" aria-current="page">
                Home
              </a>
            </li>
            <li className="nav-item">
              <a className="nav-link">Link</a>
            </li>
            <li className="nav-item dropdown">
              <a
                className="nav-link dropdown-toggle"
                id="navbarDropdown"
                role="button"
                data-bs-toggle="dropdown"
                aria-expanded="false"
              >
                Turkey's Cities
              </a>
              <ul
                className="dropdown-menu"
                aria-labelledby="navbarDropdown"
                style={{
                  maxHeight: "300px",
                  overflowY: "auto",
                  overflowX: "hidden",
                }}
              >
                {props.cities.map((city, index) => (
                  <li key={index}>
                    <button
                      onClick={(e) => getCity(`${city.city_name}`)}
                      className="dropdown-item"
                    >
                      {index + 1}-{city.city_name}
                    </button>
                  </li>
                ))}
              </ul>
            </li>
          </ul>
          <form className="d-flex">
            <input
              className="form-control me-2"
              type="search"
              placeholder="Search Cities..."
              aria-label="Search"
              onChange={(event) => setCityName(event.target.value)}
            />
            <button
              onClick={(e) => getSearchbar(cityName)}
              className="btn btn-outline-success"
              type="button"
            >
              Search
            </button>
          </form>
        </div>
      </div>
    </nav>
  );
};

export default SearchBar;
