package com.wisdom.spring.demo;

import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;

public class AuthorRowMapper implements RowMapper {
	public Author mapRow(ResultSet resultSet, int rowNumber) throws SQLException {
		Integer id = resultSet.getInt("id");
		String name = resultSet.getString("name");
		Author author = new Author();
		author.setId(id);
		author.setName(name);
		return author;
	}
}