package com.bgaynor247.weatherapp247;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.bgaynor247.weatherapp247.api.APIService;
import com.bgaynor247.weatherapp247.api.ApiUtil;
import com.bgaynor247.weatherapp247.model.CurrentWeatherItem;
import com.bgaynor247.weatherapp247.model.forecast.ForecastResults;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    private static final String API_KEY = "79408f14b5f5db6c7d82e30d878cbc2f";
    private static final String UNITS = "Imperial";
    private static final String TAG = MainActivity.class.getName();
    private static final int DEFAULT_FIRST_ITEM = 0;

    private CurrentWeatherItem currentWeatherItem;
    private APIService apiService;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        apiService = ApiUtil.getAPIService();
    }

    public void getWeatherDetails(String query) {

        apiService.getCurrentWeatherByCity(query, API_KEY, UNITS)
                .enqueue(new Callback<ForecastResults>() {
                    @Override
                    public void onResponse(Call<ForecastResults> call, Response<ForecastResults> response) {
                        if(response.isSuccessful()) {

                            Log.d(TAG, "Posts loaded from API");
                        }
                        else {
                            int statusCode = response.code();
                            String error = response.errorBody().toString();

                            Log.d(TAG, "Error - Code: " + statusCode + " - " + error);
                        }
                    }

                    @Override
                    public void onFailure(Call<ForecastResults> call, Throwable t) {
                        Log.d(TAG, "Error loading from API - " + t.getMessage());
                    }
                });
    }
}
