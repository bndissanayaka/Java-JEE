package com.wisdom.spring.demo;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;

public class Demo {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
		//BeanFactory x  = new XmlBeanFactory(new FileSystemResource("Beans.xml")); XmlBeanFactory is deprecated
		HelloWorld obj = (HelloWorld) context.getBean("helloWorld");//returns an instance of the bean??? or object type
		obj.getMessage();
		/*
		 * HelloWorld objA = (HelloWorld) context.getBean("helloWorld");
		 * objA.setMessage("I'm object A");
		 *  objA.getMessage();
		 *   HelloWorld objB = (HelloWorld) context.getBean("helloWorld"); 
		 *   objB.getMessage(); }
		 */
	}
}