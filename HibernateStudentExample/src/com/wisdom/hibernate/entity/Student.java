package com.wisdom.hibernate.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Student" ,schema="wisdom")
public class Student {
	@Id
	@Column(name = "stud_id")
	private int studId;
	@Column(name = "stud_name")
	private String studName;
	@Column(name = "address")
	private String address;
	@Column(name = "phone_no")
	private int phoneNo;
	@Column(name = "age")
	private int age;

	public Student() {
	}
	
	public int getStudId() {
		return studId;
	}

	public void setStudId(int studId) {
		this.studId = studId;
	}

	public String getStudName() {
		return studName;
	}

	public void setStudName(String studName) {
		this.studName = studName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(int phoneNo) {
		this.phoneNo = phoneNo;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	

	


}
