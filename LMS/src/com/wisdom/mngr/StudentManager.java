package com.wisdom.mngr;


import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.Transaction;
import com.wisdom.lms.pojo.Student;
import com.wisdom.util.HibernateUtil;

public class StudentManager {
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
	
	public List<Student> viewData()
	{
		Session session = null;
		
		List<Student> results= null;
		//boolean saveState = false;
		try {
			session = HibernateUtil.getSessionFactory().openSession();
			
			//using hql
			/*String hql = "FROM com.wisdom.lms.pojo.Student" ; 
			Query query = session.createQuery(hql);
			results = query.list();*/
			
			//using criteria
			/*Criteria cr = session.createCriteria(Student.class);
			results = cr.list();*/
			
			//using native sql
			String sql = "select * from student"; 
			SQLQuery query = session.createSQLQuery(sql);
			query.addEntity(Student.class); 
			results = query.list();
			

		} catch (Exception ex) {
			
			ex.printStackTrace();
		} finally {
			session.close();
		}
	return 	results;
		
		
	}
	
	public boolean createData(Student s)
	{
		Session session = null;
		

		Transaction transaction = null;
		boolean saveState = false;
		try {
			session = HibernateUtil.getSessionFactory().openSession();
			transaction = session.beginTransaction();
			session.save(s);
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
