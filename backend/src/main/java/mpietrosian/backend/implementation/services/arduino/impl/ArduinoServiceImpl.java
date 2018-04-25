package mpietrosian.backend.implementation.services.arduino.impl;

import mpietrosian.backend.implementation.exception.ApiException;
import mpietrosian.backend.implementation.exception.ArduinoConnectionException;
import mpietrosian.backend.implementation.request.arduino.ArduinoStatusRequest;
import mpietrosian.backend.implementation.response.arduino.ArduinoStatusResponse;
import mpietrosian.backend.implementation.services.arduino.ArduinoService;

public class ArduinoServiceImpl implements ArduinoService {


	@Override
	public void setConfig(ArduinoStatusRequest request) throws ApiException,  ArduinoConnectionException{
		
	}

	@Override
	public ArduinoStatusResponse getStatus() throws ApiException,  ArduinoConnectionException {
		return null;
	}

}