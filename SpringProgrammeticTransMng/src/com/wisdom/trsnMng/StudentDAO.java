package com.wisdom.trsnMng;

import java.util.List;
import javax.sql.DataSource;

public interface StudentDAO {
	public void setDataSource(DataSource ds);

	public void create(Integer id, String name, Integer age, Integer marks, Integer year);

	public List<StudentMarks> listStudents();
}
