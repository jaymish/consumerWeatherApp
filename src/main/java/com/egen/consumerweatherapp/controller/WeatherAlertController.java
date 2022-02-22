package com.egen.consumerweatherapp.controller;

import com.egen.consumerweatherapp.model.Weather;
import com.egen.consumerweatherapp.model.WeatherAlert;
import com.egen.consumerweatherapp.service.AlertService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class



WeatherAlertController {

    private AlertService alertService;
    public  WeatherAlertController(AlertService alertService){
        this.alertService=alertService;
    }

    @PostMapping("/addReading")
    public boolean addWeatherReading(@RequestBody WeatherAlert weatherAlert){
        alertService.addAlerts(weatherAlert);
        //System.out.println(weatherAlert);
        //System.out.println(weatherAlert.getWeather());
        //weatherService.addWeatherReadings(weather);
        return true;
    }

    @GetMapping(path = "/simple")
    public String mySimpleGetMethod(){
        return "My simple Method";
    }
}
