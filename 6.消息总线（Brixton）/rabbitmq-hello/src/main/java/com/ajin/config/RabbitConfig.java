package com.ajin.config;

import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Auther: ajin
 * @Date: 2019/1/25 11:24
 * @Description:
 */
@Configuration
public class RabbitConfig {
    @Bean
    public Queue helloQueue(){
        return  new Queue("hello");
    }
}
