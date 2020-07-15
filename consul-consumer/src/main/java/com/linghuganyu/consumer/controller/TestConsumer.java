package com.linghuganyu.consumer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

/**
 * @author Administrator
 * @description TODO
 * @date 2020/7/15
 */
@RestController
public class TestConsumer {

    @Autowired
    DiscoveryClient discoveryClient;

    @Autowired
    private LoadBalancerClient loadBalancerClient;

    @RequestMapping("services")
    public List<String> services(){
        List<String> services = discoveryClient.getServices();
        return services;
    }

    @RequestMapping("getServices")
    public List<ServiceInstance> getServices(){
        List<ServiceInstance> provider = discoveryClient.getInstances("provider1");
        return provider;
    }

    @RequestMapping("call")
    public String call(){
        List<ServiceInstance> provider = discoveryClient.getInstances("provider1");
        if(provider!=null && provider.size()>0){
            RestTemplate restTemplate = new RestTemplate();
            ServiceInstance serviceInstance = provider.get(0);
            String forObject = restTemplate.getForObject(serviceInstance.getUri().toString()+"/test",String.class);
            return forObject;

        }
        return "nothing";
    }

    //负载均衡
    @RequestMapping("balanceCall")
    public String balanceCall(){
        //随机获取一个服务
        ServiceInstance provider = loadBalancerClient.choose("providerName");
        String uri = provider.getUri().toString()+"/test";

        //发起请求
        RestTemplate restTemplate = new RestTemplate();
        String forObject = restTemplate.getForObject(uri, String.class);
        System.out.println(forObject+"  load");
        return forObject;
    }



}
