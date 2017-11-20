package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by xiabin on 2017/9/17.
 */
@RestController
public class TestController {

    @Autowired
    private KafkaProducerConfig kafkaProducerConfig;

    @RequestMapping(value = "/test", method = RequestMethod.GET)
    public String uIdAndTaskTdUserReviewTask() {
        kafkaProducerConfig.sendTest();
        return "2";
    }
}
