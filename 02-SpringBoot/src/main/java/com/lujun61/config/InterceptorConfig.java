package com.lujun61.config;

import com.lujun61.web.interceptor.LoginInterceptor;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/** 注册拦截器
 *
 * 在SpringBoot中，不存在配置文件，无法将拦截器信息通过配置文件进行注册。
 * 所以要想将拦截器对象注入到容器之中，必须通过实现WebMvcConfigurer接口来完成。
 */
@Configuration
public class InterceptorConfig implements WebMvcConfigurer {
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        HandlerInterceptor interceptor = new LoginInterceptor();

        /**
         * 拦截器与过滤器中的 /* 和 /** 有什么区别
         *
         * /* 是拦截所有的文件夹，不包含子文件夹
         * /** 是拦截所有的文件夹及里面的子文件夹
         */

        //指定拦截的请求地址
        String[] pathPatternArray = {"/user/**"};
        //指定不去拦截的地址
        String[] excludePathPatternArray = {"/user/login"};
        registry.addInterceptor(interceptor)
                .addPathPatterns(pathPatternArray).excludePathPatterns(excludePathPatternArray);
    }
}
