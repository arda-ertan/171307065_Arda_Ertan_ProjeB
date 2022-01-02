package com.ProjeB.WeatherAPI.Business.Dal;


import com.ProjeB.WeatherAPI.Dal.ICitiesDal;
import com.ProjeB.WeatherAPI.Entities.Cities;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class CitiesService implements ICitiesService{

    private ICitiesDal citiesDal;

    @Autowired
    public CitiesService(ICitiesDal citiesDal) {
        this.citiesDal = citiesDal;
    }

    @Override
    public List<Cities> getAll() {
        return citiesDal.getAll();
    }
}
