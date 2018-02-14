package com.wisdom.entity;

import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "student")
public class Student implements java.io.Serializable {
	private static final long serialVersionUID = 1L;
	private Integer studentId;
	private String studentName;
	private String studentAge;
	private Set<Project> studentProjects = new HashSet<Project>(0);

	public Student() {
	}

	public Student(String studentName, String studentAge) {
		this.studentName = studentName;
		this.studentAge = studentAge;
	}

	@Id
	@Column(name = "STUDENT_ID")
	public Integer getStudentId() {
		return studentId;
	}

	public void setStudentId(Integer studentId) {
		this.studentId = studentId;
	}

	@Column(name = "STUDENT_NAME")
	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	@Column(name = "STUDENT_AGE")
	public String getStudentAge() {
		return studentAge;
	}

	public void setStudentAge(String studentAge) {
		this.studentAge = studentAge;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "student")
	public Set<Project> getStudentProjects() {
		return studentProjects;
	}

	public void setStudentProjects(Set<Project> studentProjects) {
		this.studentProjects = studentProjects;
	}
}
