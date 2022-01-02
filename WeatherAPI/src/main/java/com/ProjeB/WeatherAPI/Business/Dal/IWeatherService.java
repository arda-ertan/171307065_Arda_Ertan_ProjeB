package com.ProjeB.WeatherAPI.Business.Dal;

import com.ProjeB.WeatherAPI.Entities.Weather;
import org.json.JSONException;


import java.util.List;


public interface IWeatherService {
    List<Weather> getAll();
    Weather getByCity(String cityName) throws JSONException;
    void add(String cityName) throws JSONException;
}
