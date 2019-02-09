package com.ajin.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @Auther: ajin
 * @Date: 2019/1/20 10:39
 * @Description:
 */
@RestController
public class DcController {
    @Autowired
    LoadBalancerClient loadBalancerClient;
    @Autowired
    RestTemplate restTemplate;
    @RequestMapping("/consumer")
    public  String dc(){
        //先获取服务提供者的一个实例（负载均衡）
        ServiceInstance instance=loadBalancerClient.choose("eureka-client");
        String url="http://"+instance.getHost()+":"+instance.getPort()+"/dc";
        return  restTemplate.getForObject(url,String.class);
    }
}
