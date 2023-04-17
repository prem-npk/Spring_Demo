package com.kgisl.SpringDemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Mobile {

    @RequestMapping("/web")
    public static void main(String[] args) {
       ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
       System.out.println("main method in mobile");
       Sim s = (Sim) context.getBean("sim");
       s.calling();
       s.browsing();
    }
}
