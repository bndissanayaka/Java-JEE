package com.wisdom.test;

import java.util.List;


import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.TransactionDefinition;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.DefaultTransactionDefinition;

public class StudentDAOImpl implements StudentDAO {


	private JdbcTemplate jdbctmplt;
	private PlatformTransactionManager pltfrmtransmng;


	public void setPltfrmtransmng(PlatformTransactionManager pltfrmtransmng) {
		this.pltfrmtransmng = pltfrmtransmng;
	}

	public void setJdbctmplt(JdbcTemplate jdbctmplt) {
		this.jdbctmplt = jdbctmplt;
	}
	
	@Override
	public void create(Integer id, String name, Integer age, Integer marks, Integer year) {
		TransactionDefinition trd = new DefaultTransactionDefinition();
		TransactionStatus stus = pltfrmtransmng.getTransaction(trd);
		try {
			String SQL1 = "insert into student (id,name,age) values(?,?,?)";
			jdbctmplt.update(SQL1, id, name, age);

			String SQL2 = "insert into studentmarks (sid,marks,year) values (?,?,?)";
			jdbctmplt.update(SQL2, id, marks, year);

			pltfrmtransmng.commit(stus);
		} catch (DataAccessException e) {
			System.out.println("Error in creating record, rolling back");
			pltfrmtransmng.rollback(stus);
			e.printStackTrace();
		}

	}

	@Override
	public List<StudentMarks> listStudents() {
		String SQL = "select * from student, marks where student.id = marks.sid";
		List<StudentMarks> studentMarks = jdbctmplt.query(SQL, new StudentMarksMapper());
		return studentMarks;
	}


}
