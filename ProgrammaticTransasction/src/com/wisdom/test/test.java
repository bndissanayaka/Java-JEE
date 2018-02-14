package com.wisdom.test;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.TransactionDefinition;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.DefaultTransactionDefinition;

public class test {
	private JdbcTemplate jdbctmplate;
	private PlatformTransactionManager platformTransactionManager;

	public void saveEmployee(Employee e) {
		TransactionDefinition def = new DefaultTransactionDefinition();
		TransactionStatus st = platformTransactionManager.getTransaction(def);
		try {
			String query = "insert into employee values('" + e.getId() + "','" + e.getName() + "','" + e.getSalary()
					+ "')";
			 int x = jdbctmplate.update(query);
			 System.out.println("trans "+x);
			platformTransactionManager.commit(st);
			
			
		} catch (DataAccessException e2) {
			platformTransactionManager.rollback(st);
			
		}

	}

	public void setJdbctmplate(JdbcTemplate jdbctmplate) {
		this.jdbctmplate = jdbctmplate;
	}

	public void setPlatformTransactionManager(PlatformTransactionManager platformTransactionManager) {
		this.platformTransactionManager = platformTransactionManager;
	}
}
