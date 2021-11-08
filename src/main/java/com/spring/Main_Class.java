package com.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


class Main_Class {
    public static void main(String...args){
        System.out.println("hello");
        try {
          ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
            //ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("config.xml");

            Student student1 = (Student) context.getBean("student1");
            System.out.println(student1);
        }
        catch (Exception e){
            System.out.println(e);
        }
    }

}
