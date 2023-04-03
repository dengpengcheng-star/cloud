package com.example.kafkaserver;

import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

@Component
public class KafkaProducer {

    @Autowired
    private KafkaTemplate<String, String> kafkaTemplate;

    @PostConstruct
    public void postConstructor() {
        send("sssss");
    }

    public void send(String message) {
        kafkaTemplate.send("flinktest", message);
    }

}
