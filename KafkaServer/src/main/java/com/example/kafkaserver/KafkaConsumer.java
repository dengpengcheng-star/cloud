package com.example.kafkaserver;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class KafkaConsumer {

    @KafkaListener(topics = "flinktest", groupId = "group-2")
    public void listen(String message) {
        System.out.println("Received message: " + message);
    }

}
