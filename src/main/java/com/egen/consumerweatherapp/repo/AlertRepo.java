package com.egen.consumerweatherapp.repo;

import com.egen.consumerweatherapp.model.WeatherAlert;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AlertRepo extends JpaRepository<WeatherAlert, String> {
}
