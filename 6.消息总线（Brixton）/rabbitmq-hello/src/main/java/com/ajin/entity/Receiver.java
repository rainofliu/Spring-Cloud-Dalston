package com.ajin.entity;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * @Auther: ajin
 * @Date: 2019/1/25 11:19
 * @Description:
 */
@Component
@RabbitListener(queues = "hello")
public class Receiver {
    //指定对消息的处理方法
    @RabbitHandler
    public void process(String hello) {
        System.out.println("Receiver:"+hello);
    }
}
