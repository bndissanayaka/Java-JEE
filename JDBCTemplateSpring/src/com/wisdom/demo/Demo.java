package com.wisdom.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Demo {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("Beans.xml");
		EmployeeDao ob = (EmployeeDao) ctx.getBean("edao");
		//int status = ob.saveEmployee(new Employee(1,"ann",20000));
		
		
		//System.out.println(status);
	}

}
