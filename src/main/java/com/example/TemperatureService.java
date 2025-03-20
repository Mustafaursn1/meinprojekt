package com.example;

import org.springframework.stereotype.Service;

@Service
public class TemperatureService {

    /**
     * Berehnet Grad Celsius in Grad Fahrenheit
     * Siehe auch https://www.fahrenheit-umrechnen.de
     * @param celsius Grad Celsius
     * @return Grad Fahrenheit
     */
    Double toFahrenheit(Double celsius){
        return  celsius*1.8d+32;
    }
}
