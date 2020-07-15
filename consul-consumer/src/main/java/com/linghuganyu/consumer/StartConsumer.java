package com.linghuganyu.consumer;

import com.linghuganyu.consumer.config.BalanceConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.ribbon.RibbonClient;

/**
 * @author Administrator
 * @description TODO
 * @date 2020/7/15
 */
@SpringBootApplication
@RibbonClient(name = "providerName",configuration = BalanceConfig.class)
public class StartConsumer {

    public static void main(String[] args) {
        SpringApplication.run(StartConsumer.class,args);
    }
}
