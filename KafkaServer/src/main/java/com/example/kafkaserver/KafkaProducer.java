package com.example.kafkaserver;

import com.example.kafkaserver.config.KafkaConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class KafkaProducer {

    @Autowired
    private KafkaTemplate<String, String> kafkaTemplate;

    @Scheduled(cron = "*/10 * * * * ?")
    public void send() {
        kafkaTemplate.send(KafkaConfig.topic, "message");
    }

}
