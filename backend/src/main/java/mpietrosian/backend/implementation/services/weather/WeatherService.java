package mpietrosian.backend.implementation.services.weather;

import mpietrosian.backend.implementation.response.weather.MultipleWeatherResponse;
import mpietrosian.backend.implementation.response.weather.SingleWeatherResponse;

public interface WeatherService {

    SingleWeatherResponse getCurrentWeather(String label);

    MultipleWeatherResponse getMultipleWeather(String label, long from, long to);

}