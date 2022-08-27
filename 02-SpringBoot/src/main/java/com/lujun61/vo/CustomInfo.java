package com.lujun61.vo;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component("info")
/**
 * ConfigurationProperties注解作用：将整个主配置文件映射成一个对象，用于自定义配置项比较多的情况
 *   prefix属性：指定 配置文件 中以【prefix值】开头的属性，赋值给当前类中的属性
 */
@ConfigurationProperties(prefix = "custom")
public class CustomInfo {
    private String name;
    private Integer age;

    public CustomInfo() {
    }

    public CustomInfo(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "CustomInfo{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
