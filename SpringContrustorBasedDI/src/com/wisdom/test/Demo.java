package com.wisdom.test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class Demo {

	public static void main(String[] args) {
		ApplicationContext ct = new  ClassPathXmlApplicationContext("Beans.xml");
		A a = (A) ct.getBean("a");
		a.testA();
	}
}
