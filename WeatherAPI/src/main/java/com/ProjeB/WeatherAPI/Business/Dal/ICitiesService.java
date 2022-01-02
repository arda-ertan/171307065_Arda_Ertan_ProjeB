package com.ProjeB.WeatherAPI.Business.Dal;

import com.ProjeB.WeatherAPI.Entities.Cities;
import org.springframework.stereotype.Service;

import java.util.List;

public interface ICitiesService {
    List<Cities> getAll();

}
