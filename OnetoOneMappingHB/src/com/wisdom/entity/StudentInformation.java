package com.wisdom.entity;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "student_information")
public class StudentInformation {
	private Integer studentId;
	private String address;
	private String registryNumber;
	private String phoneNumber;
	private Date enlisted;
	private Student student;

	@Id
	@Column(name = "STUDENT_ID")
	public Integer getStudentId() {
		return studentId;
	}

	public void setStudentId(Integer studentId) {
		this.studentId = studentId;
	}

	@Column(name = "ADDRESS")
	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Column(name = "REGISTRY_NUMBER")
	public String getRegistryNumber() {
		return registryNumber;
	}

	public void setRegistryNumber(String registryNumber) {
		this.registryNumber = registryNumber;
	}

	@Column(name = "PHONE_NUMBER")
	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "ENLISTED")
	public Date getEnlisted() {
		return enlisted;
	}

	public void setEnlisted(Date enlisted) {
		this.enlisted = enlisted;
	}

	@OneToOne(fetch = FetchType.LAZY)
	@PrimaryKeyJoinColumn
	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}
}
