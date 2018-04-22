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

	@Override
	public ResponseEntity getFitbitData(long from, long to) throws ApiException {
		return null;
	}

	@Override
	public ResponseEntity getFitbitDataByLabel(String label, long from, long to) throws ApiException {
		return null;
	}

	@Override
	public ResponseEntity getFitbitTodayData() throws ApiException {
		return null;
    }

	@Override
	public ResponseEntity getArduinoStatus() throws ApiException {
		return null;
	}

	@Override
	public ResponseEntity getServerStatus() throws ApiException {
		return null;
	}

	@Override
	public ResponseEntity getArduinoRawData() throws ApiException {
		return null;
	}
    
}
