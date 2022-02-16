package com.egen.consumerweatherapp.aws;

import com.amazonaws.services.sns.message.SnsNotification;
import com.egen.consumerweatherapp.model.SQSMessage;
import com.egen.consumerweatherapp.model.WeatherAlert;
import com.egen.consumerweatherapp.service.AlertService;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.configurationprocessor.json.JSONException;
import org.springframework.boot.configurationprocessor.json.JSONObject;
import org.springframework.cloud.aws.messaging.listener.annotation.SqsListener;
import org.springframework.stereotype.Component;

@Component
public class WeatherAlertsListnerSqs {

    @Autowired
    private ObjectMapper objectMapper;
    private AlertService alertService;

    public  WeatherAlertsListnerSqs(AlertService alertService){
        this.alertService=alertService;
    }


    @SqsListener("weather-alerts-queue")
    public void queueListener(String message) throws  JsonProcessingException {
        SQSMessage sqsMessage = objectMapper.readValue(message, SQSMessage.class);
        WeatherAlert weatherAlert = objectMapper.readValue(sqsMessage.getMessage(), WeatherAlert.class);
        System.out.println(weatherAlert);
        alertService.addAlerts(weatherAlert);

    }
}
