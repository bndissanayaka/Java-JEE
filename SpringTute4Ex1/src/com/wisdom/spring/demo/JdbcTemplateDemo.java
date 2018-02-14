package com.wisdom.spring.demo;

import java.util.List;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

public class JdbcTemplateDemo {
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("Beans.xml");
		JdbcTemplate template = (JdbcTemplate) ctx.getBean("jdbcTemplate");
		insert(template);
		// select(template);
		// update(template);
		// delete(template);
	}

	private static void insert(JdbcTemplate template) {
		String query = "insert into author (id, name) values (?, ?)";
		template.update(query, new Object[] { 1, "Test Author" });
	}

	private static void select(JdbcTemplate template) {
		String query = "select * from author";
		List<?> list = template.queryForList(query);
		for (Object object : list) {
			System.out.println("Object is " + object);
		}
	}

	private static void update(JdbcTemplate template) {
		String query = "update author set name = ? where id = ?";
		template.update(query, new Object[] { "Test Author 2", 1 });
	}

	private static void delete(JdbcTemplate template) {
		String query = "delete from author where id = ?";
		template.update(query, new Object[] { 1 });
	}
}