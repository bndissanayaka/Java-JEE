package com.wisdom.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Demo {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("Beans.xml");
		ClassB ob = (ClassB)ctx.getBean("classb");
		ob.checkB();

	}

}
