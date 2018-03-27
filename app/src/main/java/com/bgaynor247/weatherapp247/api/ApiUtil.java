package com.bgaynor247.weatherapp247.api;

public class ApiUtil {

    private ApiUtil() {}

    public static final String BASE_URL = "https://api.openweathermap.org/";

    public static APIService getAPIService() {
        return Client.getClient(BASE_URL).create(APIService.class);
    }
}