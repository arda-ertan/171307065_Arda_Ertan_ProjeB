package com.ProjeB.WeatherAPI.Dal;


import com.ProjeB.WeatherAPI.Entities.Weather;
import org.hibernate.Session;
import org.json.JSONException;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.client.RestTemplate;

import javax.persistence.EntityManager;
import java.time.LocalDate;
import java.time.chrono.ChronoLocalDateTime;
import java.util.Date;
import java.util.List;

@Repository
public class WeatherDal implements IWeatherDal {

    @Value( "${apiKey}" )
    private String apiKey;
    //For database processes
    private EntityManager entityManager;
    @Autowired
    public WeatherDal(EntityManager entityManager) {
        this.entityManager = entityManager;
    }
    //Calling to API with city name
    public JSONObject cityNameCall (String cityName) throws JSONException {
        String uri = "https://api.openweathermap.org/data/2.5/weather?q="+cityName+"&units=metric&appid="+apiKey;
        RestTemplate restTemplate = new RestTemplate();
        String result = restTemplate.getForObject(uri, String.class);
        JSONObject obj = new JSONObject(result);
        return obj;
    }
    //Data mapping with JSON object
    public Weather getByCity(String cityName) throws JSONException {
        JSONObject obj = cityNameCall(cityName);

        Weather weather = new Weather(obj.getString("name"),
                obj.getJSONObject("sys").getString("country"),
                obj.getJSONObject("main").getDouble("temp"),
                obj.getJSONObject("main").getDouble("temp_max"),
                obj.getJSONObject("main").getDouble("temp_min"),
                obj.getJSONArray("weather").getJSONObject(0).getString("description"),
                new Date()
                );

        System.out.println(weather);
        return weather;
    }

    @Override
    @Transactional
    public void add(String cityName) throws JSONException {
        Weather weather = getByCity(cityName);
        Session session = entityManager.unwrap(Session.class);
        session.saveOrUpdate(weather);
        System.out.println("Add operation ="+weather.toString());
        System.out.println("WeatherDal --> add function worked!");
    }


    //if you see from unexpected error check file->projectStructure->Facets->hibernate if does not exist then add !!
    //and you must match up with entity class :)
    @Override
    @Transactional
    public List<Weather> getAll() {
        Session session = entityManager.unwrap(Session.class);
        List<Weather> weathers = session.createQuery("from Weather",Weather.class).getResultList();
        System.out.println("WeatherDal --> getAll function worked!");
        return weathers;
    }

}
