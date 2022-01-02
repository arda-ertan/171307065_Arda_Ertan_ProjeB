package com.ProjeB.WeatherAPI.RestAPI;


import com.ProjeB.WeatherAPI.Business.Dal.IWeatherService;
import com.ProjeB.WeatherAPI.Entities.Weather;
import org.json.JSONException;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/weather")
public class WeatherController {

    private IWeatherService weatherService;

    public WeatherController (IWeatherService weatherService){this.weatherService = weatherService;}
    //upload new weather data to database every 10 mins
    // @Scheduled(cron="* 1 * * * *")
    void scheduleWriteToDatabase() throws JSONException {

        weatherService.add("Istanbul");
        weatherService.add("Ankara");
        weatherService.add("Berlin");
        weatherService.add("Moscow");
        weatherService.add("New york");
        System.out.println("scheduleWriteToDatabase Function --> Popular cities's weather data uploaded to database !");
    }

    @GetMapping("/weathers")
    public List<Weather> getWeathers() throws JSONException {
        return weatherService.getAll();
    }

    @PostMapping("/add/{cityname}")
    public void add(@PathVariable String cityname) throws JSONException {
        weatherService.add(cityname);
    }

    @GetMapping("/get/{cityname}")
    public Weather getCity(@PathVariable String cityname) throws JSONException {
        return weatherService.getByCity(cityname);
    }




}
