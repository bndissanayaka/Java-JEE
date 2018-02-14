package com.wisdom.manager;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.wisdom.entity.Student;
import com.wisdom.util.HibernateUtil;

public class DBHandler {
	public void saveStudent(Student st1) {
		Session session = null;
		Transaction transaction = null;
		try {
			session = HibernateUtil.getSessionFactory().openSession();
			transaction = session.beginTransaction();
			session.save(st1);
			transaction.commit();
		} catch (Exception e) {
			transaction.rollback();
			e.printStackTrace();
		} finally {
			session.close();
		}
	}

}
