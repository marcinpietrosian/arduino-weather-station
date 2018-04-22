package mpietrosian.backend.definition;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import mpietrosian.backend.implementation.exception.ApiException;

/**
 * Created by mpietrosian on 19.04.2018.
 */

@RequestMapping("/api/v1")
public interface ApiV0 {

    @RequestMapping(
        value="status/arduino",
        produces="application/json",
        method=RequestMethod.GET)
    public abstract ResponseEntity getArduinoStatus() throws ApiException;

    @RequestMapping(
        value="status/server",
        produces="application/json",
        method=RequestMethod.GET)
    public abstract ResponseEntity getServerStatus() throws ApiException;

    @RequestMapping(
        value="data/arduino",
        produces="application/json",
        method=RequestMethod.GET)
    public abstract ResponseEntity getArduinoRawData() throws ApiException;
    
    @RequestMapping(
        value="data/weather/current",
        produces="application/json",
        method=RequestMethod.GET)
    public abstract ResponseEntity getCurrentWeather() throws ApiException;

    @RequestMapping(
        value="data/weather",
        produces="application/json",
        method=RequestMethod.GET)
    public abstract ResponseEntity getWeather(@RequestParam(value="query", required=true) long from, @RequestParam(value="query", required=true) long to) throws ApiException;

    @RequestMapping(
        value="data/weather/{label}",
        produces="application/json",
        method=RequestMethod.GET)
    public abstract ResponseEntity getWeatherByLabel(@PathVariable String label, @RequestParam(value="query", required=true) long from, @RequestParam(value="query", required=true) long to) throws ApiException;

    @RequestMapping(
        value="data/fitbit",
        produces="application/json",
        method=RequestMethod.GET)
    public abstract ResponseEntity getFitbitData(@RequestParam(value="query", required=true) long from, @RequestParam(value="query", required=true) long to) throws ApiException;

    @RequestMapping(
        value="data/fitbit/{label}",
        produces="application/json",
        method=RequestMethod.GET)
    public abstract ResponseEntity getFitbitDataByLabel(@PathVariable String label, @RequestParam(value="query", required=true) long from, @RequestParam(value="query", required=true) long to) throws ApiException;

    @RequestMapping(
        value="data/fitbit/today",
        produces="application/json",
        method=RequestMethod.GET)
    public abstract ResponseEntity getFitbitTodayData() throws ApiException;

    

}
