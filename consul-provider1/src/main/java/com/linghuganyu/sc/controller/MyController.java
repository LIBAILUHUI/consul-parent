package com.linghuganyu.sc.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Administrator
 * @description TODO
 * @date 2020/7/15
 */
@RestController
public class MyController {

    @RequestMapping("test")
    public String test(){
        return "test provider1";
    }
}
