package com.wisdom.autowire;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Demo {

	public static void main(String[] args) {
		AbstractApplicationContext ctx = new ClassPathXmlApplicationContext("Beans.xml");
		ClassB obj  = (ClassB)ctx.getBean("classBId");
		obj.checkAutoWire();

	}

}
