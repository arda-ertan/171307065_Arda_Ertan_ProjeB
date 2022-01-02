package com.ProjeB.WeatherAPI.Dal;

import com.ProjeB.WeatherAPI.Entities.Cities;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class CitiesDal implements ICitiesDal{

    private CitiesRepository citiesRepository;

    @Autowired
    public CitiesDal(CitiesRepository citiesRepository) {
        this.citiesRepository = citiesRepository;
    }

    @Override
    public List<Cities> getAll() { return  (List<Cities>) citiesRepository.findAll();}


}
