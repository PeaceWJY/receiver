package com.example.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.annotation.KafkaListener;

/**
 * Created by xiabin on 2017/9/17.
 */
@Configuration
public class kafkaConsumer {

   private static final Logger logger = LoggerFactory.getLogger(kafkaConsumer.class);

    @KafkaListener(topics = "test")
    public void consumer(String message){
        logger.info("test topic message : {}", message);
    }
}

