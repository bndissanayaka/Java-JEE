package com.wisdom.manager;

import org.hibernate.Session;
import com.wisdom.entity.Employee;
import com.wisdom.util.HibernateUtil;

public class EmployeeManager {
	public void loadEmployee() {
		Session session = null;
		try {
			session = HibernateUtil.getSessionFactory().openSession();
			Employee employee = (Employee) session.load(Employee.class, new Integer(100));
			if (employee != null)
				System.out.println("--Test 01 FirstName-->" + employee.getFirstName());
			session.evict(employee);
			// Load same Employee obj again with same session
			employee = (Employee) session.load(Employee.class, new Integer(100));
			if (employee != null)
				System.out.println("--Test 02 FirstName-->" + employee.getFirstName());
		} catch (Exception ex) {
			ex.printStackTrace();
		} finally {
			session.close();
		}
	}
}

/*public class EmployeeManager {
	public void loadEmployee() {
		Session session1 = null;
		Session session2 = null;
		try {
			session1 = HibernateUtil.getSessionFactory().openSession();
			Employee employee = (Employee) session1.load(Employee.class, new Integer(100));
			if (employee != null)
				System.out.println("--Test 01 FirstName-->" + employee.getFirstName());
			// Get New Session
			session2 = HibernateUtil.getSessionFactory().openSession();
			// Load same Employee obj again with same session
			employee = (Employee) session2.load(Employee.class, new Integer(100));
			if (employee != null)
				System.out.println("--Test 02 FirstName-->" + employee.getFirstName());
		} catch (Exception ex) {
			ex.printStackTrace();
		} finally {
			session1.close();
			session2.close();
		}
	}
}*/