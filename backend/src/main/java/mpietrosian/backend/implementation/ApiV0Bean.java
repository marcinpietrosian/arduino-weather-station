package mpietrosian.backend.implementation;

import org.springframework.http.ResponseEntity;

import mpietrosian.backend.definition.ApiV0;
import mpietrosian.backend.implementation.exception.ApiException;

/**
 * Created by mpietrosian on 19.04.2018.
 */
public class ApiV0Bean extends ApiV0{

	@Override
	public ResponseEntity getCurrentWeather() throws ApiException {
		return null;
	}

	@Override
	public ResponseEntity getWeather(long from, long to) throws ApiException {
		return null;
	}

	@Override
	public ResponseEntity getWeatherByLabel(String label, long from, long to) throws ApiException {
		return null;
	}
}
