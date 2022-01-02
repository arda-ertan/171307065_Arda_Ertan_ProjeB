package com.ProjeB.WeatherAPI.Business.Dal;

import com.ProjeB.WeatherAPI.Dal.IWeatherDal;
import com.ProjeB.WeatherAPI.Dal.WeatherDal;
import com.ProjeB.WeatherAPI.Entities.Weather;
import org.json.JSONException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WeatherService implements IWeatherService{

    private WeatherDal weatherDal;

    @Autowired
    public WeatherService(WeatherDal weatherDal) {this.weatherDal = weatherDal;}

    @Override
    public List<Weather> getAll() {
        System.out.println("WeatherService --> getAll function worked!");
        return weatherDal.getAll();
    }

    @Override
    public Weather getByCity(String cityName) throws JSONException {
        System.out.println("WeatherService --> getByCity function worked!");
        return weatherDal.getByCity(cityName);
    }

    @Override
    public void add(String cityName) throws JSONException {
        System.out.println("WeatherService --> add function worked!");
        weatherDal.add(cityName);
    }
}
