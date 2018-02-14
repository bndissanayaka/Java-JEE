package com.wisdom.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Demo {
	public static void main(String[] args) {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		ClassA ob =  (ClassA) context.getBean("classA");
		ob.methodClassA();
		context.registerShutdownHook();
	}
}
