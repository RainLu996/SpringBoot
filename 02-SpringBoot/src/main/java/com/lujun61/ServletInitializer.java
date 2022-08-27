package com.lujun61;

import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;


/**
 * 继承 SpringBootServletInitializer 的目的是：可以使用外部 tomcat。
 * SpringBootServletInitializer 就是原有的 web.xml 文件的替代。使用了嵌入式 Servlet,默认是不支持 jsp。
 */
public class ServletInitializer extends SpringBootServletInitializer {

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(Application.class);
    }

}
