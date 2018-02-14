package com.wisdom.test;

import java.util.List;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringHibernateDemo {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
		PersonDAO personDAO = context.getBean(PersonDAO.class);
		Person person = new Person();
		person.setId(1);
		person.setName("Asela");
		person.setCountry("Sri Lanka");
		personDAO.save(person);
		System.out.println("Person::" + person);
		List<Person> list = personDAO.list();
		for (Person p : list) {
			System.out.println("Person List::" + p);
		}
		context.close();
	}
}
