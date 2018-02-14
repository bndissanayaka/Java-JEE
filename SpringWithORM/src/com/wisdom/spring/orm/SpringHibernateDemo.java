package com.wisdom.spring.orm;

import java.util.List;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringHibernateDemo {
	public static void main(String[] args) {
		AbstractApplicationContext ctx = new ClassPathXmlApplicationContext("Beans.xml");
		PersonDAOImpl obj = (PersonDAOImpl) ctx.getBean("personDAOImpl");
		Person p = new Person();
		
		p.setId(19);
		p.setName("name");
		p.setCountry("SL");
		obj.save(p);
		
		System.out.println("Person::" + p);
		List<Person> list = obj.list();
		System.out.println(list.size());
		for (int i = 1; i < list.size(); i++) {
			System.out.println("Person List::" + list.get(i).getId() + " " + list.get(i).getCountry() + " "
					+ list.get(i).getName());
		}
		ctx.close();
	}

}
