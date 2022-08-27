package com.lujun61.controller;

import com.lujun61.vo.CustomInfo;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

@Controller
@RequestMapping("/user")
public class WebApps {
    /**
     * 使用properties文件中的自定义属性赋值
     */
    @Value("${custom.name}")
    private String name;

    @Value("${custom.age}")
    private Integer age;

    @Resource
    private CustomInfo info;

    @RequestMapping("/hello")
    @ResponseBody
    public String testSpringBoot() {
        return "Hello World！";
    }

    @RequestMapping("/login")
    @ResponseBody
    public String testInterceptor() {
        return "Hello User！";
    }

    @RequestMapping("/custom")
    @ResponseBody
    public String customProperty() {
        return "name : " + name + "；age : " + age;
    }

    @RequestMapping("/propertiesInfo")
    @ResponseBody
    public String propertiesInfo() {
        return "name : " + info.getName() + "；age : " + info.getAge();
    }
}
