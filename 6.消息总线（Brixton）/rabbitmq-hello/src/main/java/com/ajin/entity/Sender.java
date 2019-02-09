package com.ajin.entity;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * @Auther: ajin
 * @Date: 2019/1/25 11:16
 * @Description:
 */
@Component
public class Sender {
    @Autowired
    private AmqpTemplate rabbitTemplate;
    public void send(){
       String context="hello"+new Date();
        System.out.println("Sender:"+context);
       this.rabbitTemplate.convertAndSend("hello",context);
    }
}
