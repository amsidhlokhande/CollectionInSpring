package com.amsidh.mvc.main;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.amsidh.mvc.beans.Person;

public class MainApp {
	public static void main(String[] args) {
        AbstractApplicationContext context=new ClassPathXmlApplicationContext("classpath:spring-beans.xml");
        context.registerShutdownHook();
        
        Person person=(Person)context.getBean("person");
        
        System.out.println(person.toString());
        
        
        
        context.close();
        
	}
}
