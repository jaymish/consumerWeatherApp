package com.egen.consumerweatherapp.service.impl;

import com.egen.consumerweatherapp.model.WeatherAlert;
import com.egen.consumerweatherapp.repo.AlertRepo;
import com.egen.consumerweatherapp.service.AlertService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DefaultAlertService implements AlertService {

    private AlertRepo alertRepo;

    public DefaultAlertService(AlertRepo alertRepo){
        this.alertRepo=alertRepo;
    }
    @Override
    public boolean addAlerts(WeatherAlert weatherAlert) {
        System.out.println(weatherAlert);
        alertRepo.save(weatherAlert);
        return true;
    }

    @Override
    public List<WeatherAlert> getAllAlerts() {
        List<WeatherAlert> weatherAlertList = alertRepo.findAll();
        return weatherAlertList;
    }
}
