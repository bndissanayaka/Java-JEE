package com.wisdom.manager;

import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import com.wisdom.entity.Employee;
import com.wisdom.util.HibernateUtil;

public class EmployeeManager {
	
	@SuppressWarnings("unchecked")
	public List<Employee> loadEmployeeList() {
		Session session = null;
		List<Employee> resultList = null;
		try {
		session = HibernateUtil.getSessionFactory().openSession();
		String hql = "FROM com.wisdom.entity.Employee";
		Query query = session.createQuery(hql);
		resultList = query.list();
		if (resultList != null && resultList.size() > 0)
		System.out.println("--List Size-->" + resultList.size());
		} catch (Exception ex) {
		ex.printStackTrace();
		} finally {
		session.close();
		}
		return resultList;
		}
}
