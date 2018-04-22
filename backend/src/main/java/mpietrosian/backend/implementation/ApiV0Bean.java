package mpietrosian.backend.implementation;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import mpietrosian.backend.definition.ApiV0;
import mpietrosian.backend.implementation.exception.ApiException;

/**
 * Created by mpietrosian on 19.04.2018.
 */
public class ApiV0Bean extends ApiV0{

    @Override
    @ApiOperation(value = "Gets current weather data", response = ResponseEntity.class, 
            notes = "Provides informations about current weather conditions. It uses average from last 5 minutes of data, to prevent measurement error")
	public ResponseEntity getCurrentWeather() throws ApiException {
		return null;
	}

    @Override
    @ApiOperation(value = "Gets weather data for specified period of time", response = ResponseEntity.class, 
            notes = "Returns weather data for specified period of time using unix timestamp as a key and long array as a value")
    public ResponseEntity getWeather(@ApiParam(value = "Timestamp (in epoch ms) that marks the start (inclusive) of the time period of requested data") long from, 
            @ApiParam(value = "Timestamp (in epoch ms) that marks the start (inclusive) of the time period of requested data") long to) throws ApiException {
		return null;
	}

    @Override
    @ApiOperation(value = "Gets weather data for specified label and period of time", response = ResponseEntity.class, 
            notes = "Returns weather data for specified period of time and label, using unix timestamp as a key and long array as a value")
    public ResponseEntity getWeatherByLabel(@ApiParam(value = "Label name") @RequestParam(name = "label") String label, @ApiParam(value = "Timestamp (in epoch ms) that marks the start (inclusive) of the time period of requested data") long from, 
            @ApiParam(value = "Timestamp (in epoch ms) that marks the start (inclusive) of the time period of requested data") long to) throws ApiException {
		return null;
	}

    @Override
    @ApiOperation(value = "Gets fitbit data for specified period of time", response = ResponseEntity.class, 
            notes = "Returns fitbit data for specified period of time, using unix timestamp as a key and long array as a value")
    public ResponseEntity getFitbitData(@ApiParam(value = "Timestamp (in epoch ms) that marks the start (inclusive) of the time period of requested data") long from, 
            @ApiParam(value = "Timestamp (in epoch ms) that marks the start (inclusive) of the time period of requested data") long to) throws ApiException {
		return null;
	}

    @Override
    @ApiOperation(value = "Gets fitbit data for specified label and period of time", response = ResponseEntity.class, 
            notes = "Returns fitbit data for specified period of time and label, using unix timestamp as a key and long array as a value")
    public ResponseEntity getFitbitDataByLabel(@ApiParam(value = "Label name") @RequestParam(name = "label") String label, @ApiParam(value = "Timestamp (in epoch ms) that marks the start (inclusive) of the time period of requested data") long from, 
    @ApiParam(value = "Timestamp (in epoch ms) that marks the start (inclusive) of the time period of requested data") long to) throws ApiException {
		return null;
	}

    @Override
    @ApiOperation(value = "Gets fitbit data collected today", response = ResponseEntity.class, 
            notes = "Provides data collected by fitbit this day, including sleep data from last night, if collected")
	public ResponseEntity getFitbitTodayData() throws ApiException {
		return null;
    }

    @Override
    @ApiOperation(value = "Gets arduino status", response = ResponseEntity.class, 
            notes = "Provides diagnostic information about arduino used to collect data")
	public ResponseEntity getArduinoStatus() throws ApiException {
		return null;
	}

    @Override
    @ApiOperation(value = "Gets server status", response = ResponseEntity.class, 
            notes = "Provides information about current server status")
	public ResponseEntity getServerStatus() throws ApiException {
		return null;
	}

    @Override
    @ApiOperation(value = "Gets current raw data", response = ResponseEntity.class, 
            notes = "Provides cached raw data directly from Arduino")
	public ResponseEntity getArduinoRawData() throws ApiException {
		return null;
	}
    
}
