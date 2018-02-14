package com.wisdom.hibernate.demo;

import com.wisdom.hibernate.demo.Demo;
import com.wisdom.hibernate.mngr.SrudentManager;
import com.wisdom.hibernate.entity.Student;

public class Demo {

	SrudentManager manager = null;

	public Demo() {
		manager = new SrudentManager();
	}

	public void saveData() {
		Student student = new Student();
		student.setStudId(12);
		student.setStudName("Ann");
		student.setAddress("1st lane,Maharagama");
		student.setPhoneNo(07112345676);
		student.setAge(20);
		boolean saveState = manager.saveEmployeeData(student);
		System.out.println("--saveState-->" + saveState);
	}

	public static void main(String[] args) {
		Demo demo = new Demo();
		demo.saveData();
	}	
}
