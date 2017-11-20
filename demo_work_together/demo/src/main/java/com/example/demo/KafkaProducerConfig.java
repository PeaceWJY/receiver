package com.example.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * Created by xiabin on 2017/9/17.
 */
@Component
public class KafkaProducerConfig {

    @Autowired
    private KafkaTemplate kafkaTemplate;

    private static final Logger logger = LoggerFactory.getLogger(KafkaProducerConfig.class);

    public void sendTest(){
        kafkaTemplate.send("test","hello,kafka  "  + LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss.SSS")));
    }

}
