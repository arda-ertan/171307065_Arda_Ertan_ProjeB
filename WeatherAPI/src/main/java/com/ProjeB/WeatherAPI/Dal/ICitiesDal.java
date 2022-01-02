package com.ProjeB.WeatherAPI.Dal;

import com.ProjeB.WeatherAPI.Entities.Cities;

import java.util.List;

public interface ICitiesDal {

    List<Cities> getAll();
}
