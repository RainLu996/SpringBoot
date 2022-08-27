package com.lujun61.web.filter;

import javax.servlet.*;
import java.io.IOException;

public class MyFilter implements Filter {
    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse,
                         FilterChain filterChain) throws IOException, ServletException {
        System.out.println("使用了 Servlet 中的 Filter 对象");
        filterChain.doFilter(servletRequest,servletResponse);
    }
}
