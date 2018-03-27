package com.bgaynor247.weatherapp247.api;

import com.bgaynor247.weatherapp247.model.forecast.ForecastResults;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface APIService {

    @GET("/data/2.5/forecast")
    Call<ForecastResults> getForecastById(@Query("id") String id,
                                          @Query("units") String units,
                                          @Query("appid") String appid);

    @GET("/data/2.5/weather")
    Call<ForecastResults> getCurrentWeatherByCity(@Query("q") String city,
                                                  @Query("units") String units,
                                                  @Query("appid") String appid);

    @GET("/data/2.5/weather")
    Call<ForecastResults> getCurrentWeatherByZip(@Query("zip") String zip,
                                                 @Query("units") String units,
                                                 @Query("appid") String appid);

}