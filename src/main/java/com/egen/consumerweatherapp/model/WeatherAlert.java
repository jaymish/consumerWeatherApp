package com.egen.consumerweatherapp.model;

import lombok.Data;

@Data
public class WeatherAlert {
    private String alert;
    private Weather weather;
}
