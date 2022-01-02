package com.ProjeB.WeatherAPI.Dal;

import com.ProjeB.WeatherAPI.Entities.Cities;
import org.springframework.data.repository.CrudRepository;

public interface CitiesRepository extends CrudRepository <Cities, Integer> {
}
