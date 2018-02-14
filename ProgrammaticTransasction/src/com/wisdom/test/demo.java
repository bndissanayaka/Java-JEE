package com.wisdom.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class demo {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("Beans.xml");
		test t1 = (test)ctx.getBean("test");
		
		Employee e = new Employee();
		e.setId("1");
		e.setName("name");
		e.setSalary("12000");
		
		t1.saveEmployee(e);
		
		

	}

}
