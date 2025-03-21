package com.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class TemperatureServiceTest {

    @Test
    void test_37C() {
        TemperatureService temperatureService = new TemperatureService();
        double computedFahrenheit = temperatureService.toFahrenheit(37.0d);
        double expectedFahrenheit = 98.6d;
        Assertions.assertEquals(expectedFahrenheit, computedFahrenheit,0.001d);
    }

}
