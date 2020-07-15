package com.linghuganyu.sc.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @author Administrator
 * @description TODO
 * @date 2020/7/15
 */
@ConfigurationProperties(prefix = "myconfig")
public class MyConfig {

    private String name;

    private int age;

    private String gender;

    private String idcard;

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    public String getIdcard() {
        return idcard;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setIdcard(String idcard) {
        this.idcard = idcard;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
