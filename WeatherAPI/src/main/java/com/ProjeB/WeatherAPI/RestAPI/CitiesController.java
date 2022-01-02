package com.ProjeB.WeatherAPI.RestAPI;


import com.ProjeB.WeatherAPI.Business.Dal.ICitiesService;
import com.ProjeB.WeatherAPI.Entities.Cities;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/cities")
public class CitiesController {

    private ICitiesService citiesService;

    @Autowired
    public CitiesController(ICitiesService citiesService) {
        this.citiesService = citiesService;
    }

    @GetMapping("/getAll")
    public List<Cities> getAll() { return  citiesService.getAll();}
}
