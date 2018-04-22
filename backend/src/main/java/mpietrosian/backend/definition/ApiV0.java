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

@RequestMapping("/api/v1/data")
public abstract class ApiV0 {
    
    @RequestMapping(
        value="weather/current",
        produces="application/json",
        method=RequestMethod.GET)
    public abstract ResponseEntity getCurrentWeather() throws ApiException;

    @RequestMapping(
        value="weather",
        produces="application/json",
        method=RequestMethod.GET)
    public abstract ResponseEntity getWeather(@RequestParam(value="query", required=true) long from, @RequestParam(value="query", required=true) long to) throws ApiException;

    @RequestMapping(
        value="weather/{label}",
        produces="application/json",
        method=RequestMethod.GET)
    public abstract ResponseEntity getWeatherByLabel(@PathVariable String label, @RequestParam(value="query", required=true) long from, @RequestParam(value="query", required=true) long to) throws ApiException;
}
