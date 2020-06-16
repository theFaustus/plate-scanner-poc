package com.evil.inc.platedecisiontaker.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages="com.evil.inc.platedecisiontaker")
public class PlateDecisionTakerApplication {

    public static void main(String[] args) {
        SpringApplication.run(PlateDecisionTakerApplication.class, args);
    }

}
