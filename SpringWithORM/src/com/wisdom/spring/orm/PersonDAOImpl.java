package com.wisdom.spring.orm;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class PersonDAOImpl implements PersonDAO{

	private SessionFactory sessionFactory;

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	@Override 
	public void save(Person p)
	{
		Session session = this.sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		session.persist(p);
		transaction.commit();
		session.close();
	}
	@Override
	public List<Person> list()
	{
		Session session = this.sessionFactory.openSession();
		@SuppressWarnings("unchecked")
		List<Person> list = session.createQuery("from Person").list();
		session.close();
		return list;
		
		
	}

	
	
}
