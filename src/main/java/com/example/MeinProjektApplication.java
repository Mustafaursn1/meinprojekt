package com.example;

import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@Slf4j
@SpringBootApplication

public class MeinProjektApplication implements ApplicationRunner {
    private static final Logger log = LoggerFactory.getLogger(MeinProjektApplication.class);
    public static void main(String[] args) {

        SpringApplication.run(MeinProjektApplication.class, args);
    }

    @Override
    public void run(ApplicationArguments args) throws Exception {
        log.info("Todo Anwendung ist hochgefahren");

    }
}
