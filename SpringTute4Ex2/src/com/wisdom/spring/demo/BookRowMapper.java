package com.wisdom.spring.demo;

import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

public class BookRowMapper implements RowMapper {
	private JdbcTemplate template;

	public BookRowMapper(JdbcTemplate template) {
		this.template = template;
	}

	public Book mapRow(ResultSet resultSet, int rowNumber) throws SQLException {
		Integer id = resultSet.getInt("id");
		String name = resultSet.getString("name");
		Integer authorId = resultSet.getInt("author_id");
		String authorQuery = "select id, name from author where id = ?";
		AuthorRowMapper authorRowMapper = new AuthorRowMapper();
		Author author = (Author) template.queryForObject(authorQuery, new Object[] { new Integer(authorId) },
				authorRowMapper);
		Book book = new Book();
		book.setId(id);
		book.setName(name);
		book.setAuthorId(authorId);
		book.setAuthor(author);
		return book;
	}
}