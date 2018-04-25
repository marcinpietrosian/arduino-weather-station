package mpietrosian.backend.implementation.services.arduino;

import mpietrosian.backend.implementation.exception.ApiException;
import mpietrosian.backend.implementation.exception.ArduinoConnectionException;
import mpietrosian.backend.implementation.request.arduino.ArduinoStatusRequest;
import mpietrosian.backend.implementation.response.arduino.ArduinoStatusResponse;

public interface ArduinoService {
    
    void setConfig(ArduinoStatusRequest request) throws ApiException, ArduinoConnectionException;

    ArduinoStatusResponse getStatus() throws ApiException,  ArduinoConnectionException;
}