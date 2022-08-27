package com.lujun61;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * EnableDubbo注解就包含了以下注解：表示【启动dubbo配置】以及扫描【拥有dubbo注解的类】
 *    @EnableDubboConfig
 *    @DubboComponentScan
 */
@EnableDubbo
@SpringBootApplication
public class ProviderApplication {

    public static void main(String[] args) {
        SpringApplication.run(ProviderApplication.class, args);
    }

}
