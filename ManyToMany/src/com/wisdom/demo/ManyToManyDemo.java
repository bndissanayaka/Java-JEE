package com.wisdom.demo;

import org.hibernate.Session;
import org.hibernate.Transaction;
import com.wisdom.entity.Student;
import com.wisdom.entity.Class;
import com.wisdom.util.HibernateUtil;

public class ManyToManyDemo {
	public static void main(String[] args) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction transaction = null;
		try {
			transaction = session.beginTransaction();
			Student student1 = new Student(new Integer(150), "Kamal", "21");
			Student student2 = new Student(new Integer(151), "Nimal", "21");
			Class class1 = new Class(new Integer(10), "Java", "1 semester");
			Class class2 = new Class(new Integer(11), "DBMS", "1 semester");
			Class class3 = new Class(new Integer(12), "Android", "2 semester");
			student1.getStudentClasses().add(class1);
			student1.getStudentClasses().add(class2);
			student2.getStudentClasses().add(class1);
			student2.getStudentClasses().add(class2);
			student2.getStudentClasses().add(class3);
			class1.getAssignedStudents().add(student1);
			class1.getAssignedStudents().add(student2);
			class2.getAssignedStudents().add(student1);
			class2.getAssignedStudents().add(student2);
			class3.getAssignedStudents().add(student2);
			session.save(student1);
			session.save(student2);
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
