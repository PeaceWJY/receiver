package com.example.demo;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

/**
 * Created by apple on 2017/8/9.
 */
@RestController
public class TaskControllrt {

    @Autowired
    KafkaTemplate kafkaTemplate;


    @Autowired
    private KafkaProducerConfig kafkaProducerConfig;
    @RequestMapping(value = "/test", method = RequestMethod.GET)
    public String uIdAndTaskTdUserReviewTask() {
        kafkaProducerConfig.sendTest();
        return "2";
    }



}
