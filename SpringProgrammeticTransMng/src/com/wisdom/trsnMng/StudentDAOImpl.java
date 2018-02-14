package com.wisdom.trsnMng;

import java.util.List;
import javax.sql.DataSource;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.TransactionDefinition;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.DefaultTransactionDefinition;

public class StudentDAOImpl implements StudentDAO {
	private DataSource dataSource;
	private JdbcTemplate jdbcTemplateObject;
	private PlatformTransactionManager transactionManager;

	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
		this.jdbcTemplateObject = new JdbcTemplate(dataSource);
	}

	public void setTransactionManager(PlatformTransactionManager transactionManager) {
		this.transactionManager = transactionManager;
	}

	public void create(Integer sid, String name, Integer age, Integer marks, Integer year) {
		TransactionDefinition def = new DefaultTransactionDefinition();
		TransactionStatus status = transactionManager.getTransaction(def);
		try {
			String SQL1 = "insert into student (id, name, age) values (?, ?, ?)";
			jdbcTemplateObject.update(SQL1, sid, name, age);
			String SQL2 = "insert into marks(sid, marks, year) " + "values (?, ?, ?)";
			jdbcTemplateObject.update(SQL2, sid, marks, year);
			System.out.println("Created Name = " + name + ", Age = " + age);
			transactionManager.commit(status);
		} catch (DataAccessException e) {
			System.out.println("Error in creating record, rolling back");
			transactionManager.rollback(status);
			throw e;
		}
		return;
	}

	public List<StudentMarks> listStudents() {
		String SQL = "select * from student, marks where student.id=marks.sid";
		List<StudentMarks> studentMarks = jdbcTemplateObject.query(SQL, new StudentMarksMapper());
		return studentMarks;
	}
}
