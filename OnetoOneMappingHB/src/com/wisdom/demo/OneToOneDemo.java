package com.wisdom.demo;

import java.util.Date;
import org.hibernate.Session;
import org.hibernate.Transaction;
import com.wisdom.entity.Student;
import com.wisdom.entity.StudentInformation;
import com.wisdom.util.HibernateUtil;

public class OneToOneDemo {
	public static void main(String[] args) {
		Session session = null;
		Transaction transaction = null;
		try {
			session = HibernateUtil.getSessionFactory().openSession();
			transaction = session.beginTransaction();
			Student student = new Student();
			student.setStudentId(new Integer(100));
			student.setStudentName("Student 1");
			student.setStudentAge("20");
			
			StudentInformation studentInfo = new StudentInformation();
			studentInfo.setStudentId(new Integer(100));
			studentInfo.setAddress("1st Street, Colombo 07");
			studentInfo.setPhoneNumber("071-1070216");
			studentInfo.setRegistryNumber("W001");
			studentInfo.setEnlisted(new Date());
			
			studentInfo.setStudent(student);
			student.setStudentInfo(studentInfo);
			
			session.save(student);
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
