package com.lujun61.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 * @PropertySource 是读取 properties 属性配置文件的
 */
@Configuration
@PropertySource(value = "classpath:config.properties")
@ComponentScan(value = "com.lujun61.vo")
public class PropertiesConfig {}
