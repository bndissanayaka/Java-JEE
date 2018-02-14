package com.wisdom.mngr;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

import com.wisdom.entity.Employee;
import com.wisdom.util.HibernateUtil;

public class EmployeeManager {
	public boolean saveEmployeeData(Employee employee) {
		Session session = null;
		Transaction transaction = null;
		boolean saveState = false;
		try {
			session = HibernateUtil.getSessionFactory().openSession();
			transaction = session.beginTransaction();
			session.save(employee);
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

	public List<Employee> viewData() {
		Session session = null;

		List<Employee> results = null;
		// boolean saveState = false;
		try {
			session = HibernateUtil.getSessionFactory().openSession();

			Criteria cr = session.createCriteria(Employee.class);
			cr.add(Restrictions.eq("salary", 2000)); 
			results = cr.list();
			//results.iterator()
			System.out.println();
			// saveState = true;
		} catch (Exception ex) {

			ex.printStackTrace();
		} finally {
			session.close();
		}
		return results;

	}

}
