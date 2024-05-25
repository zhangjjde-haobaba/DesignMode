package com.kgc.servelt;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by jiang on 9/6/23 11:39 AM
 */
public class MyHttpServlet extends MyGeneraticServlet {

    //只需要重写service方法
    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        HttpServletRequest request = (HttpServletRequest)servletRequest;
        HttpServletResponse response = (HttpServletResponse)servletResponse;
        String method = request.getMethod();
        int num;
        num = method.equals("GET") ? 1 : 0;
        switch (num){
            case 1:
                this.doGet(request,response);
                break;
            case 0:
                this.doPost(request,response);
                break;

        }

    }

    public void doGet(HttpServletRequest request, HttpServletResponse response){

    }

    public void doPost(HttpServletRequest request, HttpServletResponse response){

    }
}
