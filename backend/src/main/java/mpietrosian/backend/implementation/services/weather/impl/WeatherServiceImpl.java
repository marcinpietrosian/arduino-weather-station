package mpietrosian.backend.implementation.services.weather.impl;

import mpietrosian.backend.implementation.model.weather.Meteorology;
import mpietrosian.backend.implementation.response.weather.MultipleWeatherResponse;
import mpietrosian.backend.implementation.response.weather.SingleWeatherResponse;
import mpietrosian.backend.implementation.services.weather.WeatherService;

public class WeatherServiceImpl implements WeatherService {

    @Override
    public SingleWeatherResponse getCurrentWeather(String label) {
        return null;
    }

    @Override
    public MultipleWeatherResponse getMultipleWeather(String label, long from, long to) {
        return null;
    }

    private Meteorology getWeatherFromOnlineSite(String URI) {

        return new Meteorology();
    }

}