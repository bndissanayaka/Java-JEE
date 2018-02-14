package com.wisdom.spring.demo;

import java.util.List;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

public class RowMapperDemo {
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("Beans.xml");
		JdbcTemplate template = (JdbcTemplate) ctx.getBean("jdbcTemplate");
		forAuthor(template);
		forBook(template);
	}

	@SuppressWarnings("unchecked")
	private static void forAuthor(JdbcTemplate template) {
		AuthorRowMapper authorRowMapper = new AuthorRowMapper();
		String singleResultQuery = "select id, name from author where id = ?";
		Author author = (Author) template.queryForObject(singleResultQuery, new Object[] { new Integer(1) },
				authorRowMapper);
		System.out.println("Author is " + author);
		String multiResultQuery = "select * from author";
		List<Author> authors = (List<Author>) template.query(multiResultQuery, authorRowMapper);
		for (Author anAuthor : authors) {
			System.out.println("Author is " + anAuthor);
		}
	}

	@SuppressWarnings("unchecked")
	private static void forBook(JdbcTemplate template) {
		BookRowMapper bookRowMapper = new BookRowMapper(template);
		String query = "select id, name, author_id from book where id = ?";
		Book book = (Book) template.queryForObject(query, new Object[] { new Integer(1) }, bookRowMapper);
		System.out.println("Book is " + book);
	}
}