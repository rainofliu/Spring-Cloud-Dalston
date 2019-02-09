package com.ajin.controller;

import com.ajin.service.ConsumerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Auther: ajin
 * @Date: 2019/1/20 10:39
 * @Description:
 */
@RestController
public class DcController {

    @Autowired
    ConsumerService service;
    @RequestMapping("/consumer")
    public  String dc(){
        return service.consumer();
    }
}
