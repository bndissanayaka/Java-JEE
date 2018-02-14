package com.wisdom.test;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class StudentMarksMapper implements RowMapper<StudentMarks>{

	@Override
	public StudentMarks mapRow(ResultSet rs, int rowNum) throws SQLException {
		
		StudentMarks st = new StudentMarks();
		st.setId(rs.getInt("id"));
		st.setName(rs.getString("name"));
		st.setAge(rs.getInt("age"));
		st.setSid(rs.getInt("sid"));
		st.setMarks(rs.getInt("marks"));
		st.setYear(rs.getInt("year"));
		
		return st;
	}

	

}
