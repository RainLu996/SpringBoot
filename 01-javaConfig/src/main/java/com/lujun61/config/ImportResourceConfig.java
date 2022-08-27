package com.lujun61.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

/**
 * ImportResource注解：是导入 xml 配置，等同于 xml 文件的 resources
 */
@Configuration
@ImportResource(value = {"classpath:beans.xml","classpath:applicationContext.xml"})
public class ImportResourceConfig {}
