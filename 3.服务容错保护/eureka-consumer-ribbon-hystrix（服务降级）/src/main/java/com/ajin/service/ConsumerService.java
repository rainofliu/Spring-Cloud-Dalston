package com.ajin.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * @Auther: ajin
 * @Date: 2019/1/21 16:53
 * @Description:
 */
@Service
public class ConsumerService {
    @Autowired
    RestTemplate restTemplate;
    @HystrixCommand(fallbackMethod = "fallback")
    public  String consumer(){
        return  restTemplate.getForObject("http://eureka-client/dc",String.class);
    }
    public String fallback(){
        return "fallback";
    }
}
