package com.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.stream.Stream;

@SpringBootTest
public class TemperatureServiceTest {

   /* @Autowired
    TemperatureService temperatureService;

    */


    @Test
    void test01_37C(@Autowired TemperatureService temperatureService) {

        double computedFahrenheit = temperatureService.toFahrenheit(37.0d);
        double expectedFahrenheit = 98.6d;
        Assertions.assertEquals(expectedFahrenheit, computedFahrenheit, 0.001d);
    }

    @Autowired TemperatureService temperatureService;

    @ParameterizedTest
    @MethodSource("celsiusFahrenheitSource")
    void test_toFahrenheit(double celcius, double expectedFahrenheit) {

        double computedFahrenheit = temperatureService.toFahrenheit(celcius);

        Assertions.assertEquals(expectedFahrenheit, computedFahrenheit, 0.001d);
    }

    private static Stream<Arguments> celsiusFahrenheitSource() {
        return Stream.of(
                Arguments.of(37.0d, 98.6d),
                Arguments.of(0.0d, 32.0d)
                );


    }

}
