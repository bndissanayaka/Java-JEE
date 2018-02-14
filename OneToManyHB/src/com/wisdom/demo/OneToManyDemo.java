package com.wisdom.demo;

import org.hibernate.Session;
import org.hibernate.Transaction;
import com.wisdom.entity.Project;
import com.wisdom.entity.Student;
import com.wisdom.util.HibernateUtil;

public class OneToManyDemo {
	public static void main(String[] args) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction transaction = null;
		try {
			transaction = session.beginTransaction();
			Student student = new Student();
			student.setStudentId(new Integer(200));
			student.setStudentName("Test Student 2");
			student.setStudentAge("20");
			Project project1 = new Project(new Integer(111), "Maths", "Winter");
			project1.setStudent(student);
			student.getStudentProjects().add(project1);
			Project project2 = new Project(new Integer(222), "Architecture", "Spring");
			project2.setStudent(student);
			student.getStudentProjects().add(project2);
			session.save(student);
			Integer id = (Integer) session.save(project1);
			session.save(project2);
			System.out.println("id "+id);
			transaction.commit();
			System.out.println("Operation Successfully");
		} catch (Exception ex) {
			transaction.rollback();
			ex.printStackTrace();
			System.out.println("Operation Fail");
		} finally {
			session.close();
		}
	}
}
