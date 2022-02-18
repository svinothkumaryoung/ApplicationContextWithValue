package com.iisn.withval;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainFunction {
    public static void main(String[] args) {
        ApplicationContext ac=new ClassPathXmlApplicationContext("Val.xml");
        ValuePassing vp=(ValuePassing)ac.getBean("v");
        vp.printUserData();
    }
}
