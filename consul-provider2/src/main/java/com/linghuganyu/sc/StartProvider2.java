package com.linghuganyu.sc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author Administrator
 * @description TODO
 * @date 2020/7/15
 */
@EnableDiscoveryClient  //服务自动发现
@SpringBootApplication
public class StartProvider2 {

    public static void main(String[] args) {
        System.out.println("Provider2");
        SpringApplication.run(StartProvider2.class,args);
    }
}
