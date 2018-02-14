package com.wisdom.test;

import java.util.List;
import javax.sql.DataSource;

public interface StudentDAO {
	
	public void create(Integer id, String name, Integer age, Integer marks, Integer year);
	public List<StudentMarks> listStudents();
}
