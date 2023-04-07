package com.example.kafkaserver;

import com.example.kafkaserver.config.KafkaConfig;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class KafkaConsumer {


    @KafkaListener(topics = KafkaConfig.topic, groupId = "group-2")
    public void listen(String message) {
        System.out.println("Received message: " + message);
    }

}
