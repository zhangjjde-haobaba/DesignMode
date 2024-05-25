package com.kgc.servelt;

import javax.servlet.*;
import java.io.IOException;

/**
 * Created by jiang on 9/6/23 11:33 AM
 */
public class MyGeneraticServlet implements Servlet {

    public void init(ServletConfig servletConfig) throws ServletException {

    }

    public ServletConfig getServletConfig() {
        return null;
    }

    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        //只有这个方法是有作用的 其他四个是模版
    }

    public String getServletInfo() {
        return null;
    }

    public void destroy() {

    }
}
