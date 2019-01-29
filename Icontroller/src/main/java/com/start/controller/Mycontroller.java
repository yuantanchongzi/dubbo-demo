package com.start.controller;

import com.start.interfance.MyInterfance;
import com.start.service.MyService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Author: Francis
 * @Description:
 * @TIME: Created on 2018/8/17
 * @Modified by:
 */

@Controller
public class Mycontroller {
    public static void main(String[] arg) {
        ClassPathXmlApplicationContext hello=new ClassPathXmlApplicationContext("applicationContext.xml");
        hello.start();
        MyInterfance inter=(MyInterfance) hello.getBean("myInterfance");
        String str=inter.getId();
        System.out.println(str+"\n"+"\n"+"\n");
    }
}