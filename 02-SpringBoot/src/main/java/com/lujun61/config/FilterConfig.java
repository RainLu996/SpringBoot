package com.lujun61.config;

import com.lujun61.web.filter.MyFilter;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FilterConfig {
    @Bean
    public FilterRegistrationBean filterRegistrationBean() {
        FilterRegistrationBean reg = new FilterRegistrationBean();

        //使用哪个过滤器
        reg.setFilter(new MyFilter());

        //要使用过滤器的浏览器地址
        reg.addUrlPatterns("/user/*");

        return reg;
    }


/*  SpringBoot中，字符集过滤器配置：
    如果在配置文件中对SpringBoot中内置的CharacterEncodingFilter进行了属性修改，
    则不需要在此处自定义CharacterEncodingFilter过滤器。

    @Bean
    public FilterRegistrationBean characterEncodingFilterBean(){
        FilterRegistrationBean reg = new FilterRegistrationBean();

        //创建 CharacterEncodingFilter
        CharacterEncodingFilter filter = new CharacterEncodingFilter();

        //设置 request， response 使用编码的值
        filter.setEncoding("utf-8");

        //强制 request， response 使用 encoding 的值
        filter.setForceEncoding(true);

        reg.setFilter(filter);
        //要使用此过滤器的浏览器访问地址
        reg.addUrlPatterns("/*");

        return reg;
    }*/
}
