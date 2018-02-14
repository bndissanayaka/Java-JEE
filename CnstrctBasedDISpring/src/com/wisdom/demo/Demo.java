package com.wisdom.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Demo{

	public static void main(String[] args) {
		//ClassA ca = new ClassA();
		ApplicationContext ctx = new ClassPathXmlApplicationContext("Beans.xml");
		ClassA ca =(ClassA)ctx.getBean("classA");
		ca.testA();
		

	}

}
