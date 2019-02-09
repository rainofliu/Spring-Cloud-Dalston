package com.ajin.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Auther: ajin
 * @Date: 2019/1/20 09:11
 * @Description:
 */
@RestController
public class DcController {
    @Autowired
    DiscoveryClient discoveryClient;

    @RequestMapping("/dc")
    public String dc() throws InterruptedException {
        //Thread.sleep(5000L);
        //获取客户端缓存的所有服务清单
        String services = "Services: " + discoveryClient.getServices();
        System.out.println(services);
        return services;
    }
}
