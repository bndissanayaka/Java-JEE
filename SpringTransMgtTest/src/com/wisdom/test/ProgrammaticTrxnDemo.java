package com.wisdom.test;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ProgrammaticTrxnDemo {
	public static void main(String[] args) {

		ApplicationContext ctx = new ClassPathXmlApplicationContext("Beans.xml");
		StudentDAOImpl std = (StudentDAOImpl) ctx.getBean("studentDAOImpl");

		std.create(1, "ann", 12, 90, 1992);
		std.create(2, "anna", 13, 83, 1992);
		std.create(3, "annie", 17, 84, 1992);

		System.out.println("------Listing all the records--------");
		List<StudentMarks> studentMarks = std.listStudents();
		for (StudentMarks record : studentMarks) {
			System.out.print("ID : " + record.getId());
			System.out.print(", Name : " + record.getName());
			System.out.print(", Marks : " + record.getMarks());
			System.out.print(", Year : " + record.getYear());
			System.out.println(", Age : " + record.getAge());
		}
	}
}
