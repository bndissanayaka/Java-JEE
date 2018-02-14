package com.wisdom.bean;

import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

@ManagedBean(name = "StudentDetailsLoaderBean")
@ViewScoped
public class StudentDetailsLoaderBean {
	public List<Student> studDisplayList = new ArrayList<Student>();

	public StudentDetailsLoaderBean() {
		Student student = new Student();
		student.setRegNo("100");
		student.setFirstName("Asela");
		student.setLastName("Liyanage");
		student.setEmail("asela@gamil.com");
		student.setPhone("0711070216");
		// Add Student To Display List
		studDisplayList.add(student);
		student = new Student();
		student.setRegNo("101");
		student.setFirstName("Test 1");
		student.setLastName("Test 1");
		student.setEmail("test1@gamil.com");
		student.setPhone("0711070216");
		// Add Student To Display List
		studDisplayList.add(student);
		student = new Student();
		student.setRegNo("102");
		student.setFirstName("Test 2");
		student.setLastName("Test 2");
		student.setEmail("test2@gamil.com");
		student.setPhone("0711070216");
		// Add Student To Display List
		studDisplayList.add(student);
	}

	public List<Student> getStudDisplayList() {
		return studDisplayList;
	}

	public void setStudDisplayList(List<Student> studDisplayList) {
		this.studDisplayList = studDisplayList;
	}
}
