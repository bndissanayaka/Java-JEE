package com.wisdom.hibernate.mngr;

import org.hibernate.Session;
import org.hibernate.Transaction;
import com.wisdom.hibernate.entity.Student;
import com.wisdom.hibernate.util.HibernateUtil;

public class SrudentManager {
	public boolean saveEmployeeData(Student student) {
		Session session = null;
		Transaction transaction = null;
		boolean saveState = false;
		try {
			session = HibernateUtil.getSessionFactory().openSession();
			transaction = session.beginTransaction();
			session.save(student);
			transaction.commit();
			saveState = true;
		} catch (Exception ex) {
			transaction.rollback();
			ex.printStackTrace();
		} finally {
			session.close();
		}
		return saveState;
	}
}