/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.model;

/**
 *
 * @author ZAKARIA
 */
public class EnjoySport {
    private Long id;
    private String sky;
    private String airTemp;
    private String humidity;
    private String wind;
    private String water;
    private String forecast;
    private Boolean enjoy;

    public EnjoySport(Long id, String sky, String airTemp, String humidity, String wind, String water, String forecast, Boolean enjoy) {
        this.id = id;
        this.sky = sky;
        this.airTemp = airTemp;
        this.humidity = humidity;
        this.wind = wind;
        this.water = water;
        this.forecast = forecast;
        this.enjoy = enjoy;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSky() {
        return sky;
    }

    public void setSky(String sky) {
        this.sky = sky;
    }

    public String getAirTemp() {
        return airTemp;
    }

    public void setAirTemp(String airTemp) {
        this.airTemp = airTemp;
    }

    public String getHumidity() {
        return humidity;
    }

    public void setHumidity(String humidity) {
        this.humidity = humidity;
    }

    public String getWind() {
        return wind;
    }

    public void setWind(String wind) {
        this.wind = wind;
    }

    public String getWater() {
        return water;
    }

    public void setWater(String water) {
        this.water = water;
    }

    public String getForecast() {
        return forecast;
    }

    public void setForecast(String forecast) {
        this.forecast = forecast;
    }

    public Boolean getEnjoy() {
        return enjoy;
    }

    public void setEnjoy(Boolean enjoy) {
        this.enjoy = enjoy;
    }
    
    
}
