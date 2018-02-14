package com.wisdom.spring.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Demo {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(new String[] { "Beans.xml" });
		EmployeeBean employee = (EmployeeBean) context.getBean("employee");
		System.out.println(employee.getFullName());
		System.out.println(employee.getDepartmentBean().getName());
	}
}
