package com.example;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

import java.util.stream.Stream;

@Component
public class BeansLogger implements ApplicationRunner {


    private static final Logger log = LoggerFactory.getLogger(BeansLogger.class);
    /*@Autowired
    private ApplicationContext context;
    Das ist eine Möglichkeit mit @Autowired
     */

    //Das ist andere Möglichkeit mit Consructor
   // @Autowired kann es sein aber das ist überflüssig worden
    private final ApplicationContext context;
    public BeansLogger(ApplicationContext context) {
        this.context = context;
    }

    @Override
    public void run(ApplicationArguments args) throws Exception {
        log.info("Hello World!");
        log.info(context.getApplicationName());
        Stream.of(context.getBeanDefinitionNames()).forEach(log::info);

    }
}
