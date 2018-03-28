package com.bgaynor247.weatherapp247.model;

public class CurrentWeatherItem {

    private long cityId;
    private String mainCondition;
    private String descriptionCondition;
    private int timeOfDataCalculation;
    private double tempHigh;
    private double tempLow;
    private Double windSpeed;
    private int pressure;
    private int humidity;
    private int sunrise;
    private int sunset;
    private String cityName;

    public CurrentWeatherItem(long cityId, String mainCondition, String descriptionCondition, int timeOfDataCalculation, double tempHigh, double tempLow,
                              double windSpeed, int pressure, int humidity, int sunrise, int sunset, String cityName) {
        this.cityId = cityId;
        this.mainCondition = mainCondition;
        this.descriptionCondition = descriptionCondition;
        this.timeOfDataCalculation = timeOfDataCalculation;
        this.tempHigh = tempHigh;
        this.tempLow = tempLow;
        this.windSpeed = windSpeed;
        this.pressure = pressure;
        this.humidity = humidity;
        this.sunrise = sunrise;
        this.sunset = sunset;
        this.cityName = cityName;
    }

    public long getCityId() {
        return cityId;
    }

    public String getMainCondition() {
        return mainCondition;
    }

    public String getDescriptionCondition() {
        return descriptionCondition;
    }

    public int getTimeOfDataCalculation() {
        return timeOfDataCalculation;
    }

    public double getTempHigh() {
        return tempHigh;
    }

    public double getTempLow() {
        return tempLow;
    }

    public Double getWindSpeed() {
        return windSpeed;
    }

    public int getPressure() {
        return pressure;
    }

    public int getHumidity() {
        return humidity;
    }

    public int getSunrise() {
        return sunrise;
    }

    public int getSunset() {
        return sunset;
    }

    public String getCityName() {
        return cityName;
    }
}