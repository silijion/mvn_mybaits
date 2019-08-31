package com.qm.silijion.controller;

import com.qm.silijion.javabean.User;
import com.qm.silijion.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.context.support.SpringBeanAutowiringSupport;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Controller("helloController")
public class HelloController extends HttpServlet {


    @Autowired
    private HelloService helloService;

    @Override
    public void init(ServletConfig config) throws ServletException
    {
        SpringBeanAutowiringSupport.processInjectionBasedOnServletContext(this, config.getServletContext());
    }

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        User user = new User();
//        user.setUserName(5L);
//        user.setPassWord("haode");
//        user.setMoney(10000.0);
//        helloService.insertUser(user);
        User user1 = helloService.queryById(1);
        System.out.println(user1);
    }
}
