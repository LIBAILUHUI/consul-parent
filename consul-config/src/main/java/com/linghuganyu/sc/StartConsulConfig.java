package com.linghuganyu.sc;

import com.linghuganyu.sc.config.MyConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

/**
 * @author Administrator
 * @description TODO
 * @date 2020/7/15
 */
@EnableConfigurationProperties({MyConfig.class})
@SpringBootApplication
public class StartConsulConfig {

    public static void main(String[] args) {
        SpringApplication.run(StartConsulConfig.class,args);
    }
}
