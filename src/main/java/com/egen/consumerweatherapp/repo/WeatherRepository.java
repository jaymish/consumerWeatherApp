package com.egen.consumerweatherapp.repo;

import com.egen.consumerweatherapp.model.Weather;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface WeatherRepository extends JpaRepository<Weather, String> {
}
