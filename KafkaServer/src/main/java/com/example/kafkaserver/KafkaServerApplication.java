package com.example.kafkaserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class KafkaServerApplication {
    public static ConfigurableApplicationContext context;

    public static void main(String[] args) {

        context = SpringApplication.run(KafkaServerApplication.class, args);
    }

}
