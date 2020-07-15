package com.linghuganyu.sc.controller;

import com.linghuganyu.sc.config.MyConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Administrator
 * @description TODO
 * @date 2020/7/15
 */
@RestController
@RefreshScope   //刷新，实例热加载
public class TestController {

    //如果不存在赋默认值zhangsan
    @Value("${myNameKey:zhangsan}")
    private String myName;

    @Autowired
    private MyConfig myConfig;

    @RequestMapping("test")
    public String test(){
        return myName;
    }


    @RequestMapping("myConfig")
    public MyConfig myConfig(){
        return myConfig;
    }
}
