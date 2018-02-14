package com.wisdom.trsnMng;

import java.util.List;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ProgrammaticTrxnDemo {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
		StudentDAOImpl studentDAOImpl = (StudentDAOImpl) context.getBean("studentDAOImpl");
		System.out.println("------Records creation--------");
		studentDAOImpl.create(1, "Student 01", 11, 99, 2010);
		studentDAOImpl.create(2, "Student 02", 20, 97, 2010);
		studentDAOImpl.create(3, "Student 03", 25, 100, 2011);
		System.out.println("------Listing all the records--------");
		List<StudentMarks> studentMarks = studentDAOImpl.listStudents();
		for (StudentMarks record : studentMarks) {
			System.out.print("ID : " + record.getId());
			System.out.print(", Name : " + record.getName());
			System.out.print(", Marks : " + record.getMarks());
			System.out.print(", Year : " + record.getYear());
			System.out.println(", Age : " + record.getAge());
		}
	}
}
