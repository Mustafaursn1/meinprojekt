package com.example;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;


@RestController
public class TemperatureController {

    @GetMapping("to_fahrenheit")
    public String toFahrenheit(@Autowired TemperatureService temperatureService,
                               @RequestParam Optional<Double> celsius) {
        return  celsius.
                map(temperatureService::toFahrenheit).
                map(String::valueOf).
                orElse("celsius Wert wurde nicht angegeben.");



    }


}
