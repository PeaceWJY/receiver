package com.example.demo;

/**
 * Created by apple on 2017/9/10.
 */
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.kafka.annotation.KafkaListener;

import java.util.Optional;

public class Listener {

    @KafkaListener(topics = {"lalala"},topicPattern = "0",id = "576d93a8dc0cf421")
    public String listen(ConsumerRecord<?, ?> record) {
        Optional<?> kafkaMessage = Optional.ofNullable(record.value());
        if (kafkaMessage.isPresent()) {
            Object message = kafkaMessage.get();
            System.out.println("listen1 " + message);
            return message.toString();
        }else {
            return "1";
        }
    }
}