package com.egen.consumerweatherapp.service;

import com.egen.consumerweatherapp.model.WeatherAlert;

import java.util.List;

public interface AlertService {
    boolean addAlerts(WeatherAlert weatherAlert);
    List<WeatherAlert> getAllAlerts();

}
