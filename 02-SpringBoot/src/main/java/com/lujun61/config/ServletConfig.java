package com.lujun61.config;

import com.lujun61.web.servlet.MyServlet;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 注册Servlet
 * <p>
 * ServletRegistrationBean 用来做在 servlet 3.0+容器中注册 servlet 的功能，但更具有SpringBean 友好性。
 */
@Configuration
public class ServletConfig {
    @Bean
    public ServletRegistrationBean servletRegistrationBean() {
/*         ServletRegistrationBean reg = new ServletRegistrationBean();
        reg.setServlet( new MyServlet());
        reg.addUrlMappings("/myservlet");
        return reg;*/

        ServletRegistrationBean reg = new ServletRegistrationBean(new MyServlet(), "/loginServlet");
        return reg;
    }
}
