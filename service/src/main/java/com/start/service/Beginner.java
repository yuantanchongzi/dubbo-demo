package com.start.service;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author: Francis
 * @Description:
 * @TIME: Created on 2018/8/17
 * @Modified by:
 */
public class Beginner {

    public static void main(String[] arg) throws Exception{
        ClassPathXmlApplicationContext cpa=new ClassPathXmlApplicationContext("applicationContext.xml");
        cpa.start();
        System.out.println("logo consumer go");
        System.in.read();
    }
}
