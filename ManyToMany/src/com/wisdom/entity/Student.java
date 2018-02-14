package com.wisdom.entity;

import java.util.HashSet;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "student")
public class Student implements java.io.Serializable {
	private static final long serialVersionUID = 1L;
	private Integer studentId;
	private String studentName;
	private String studentAge;
	private Set<Class> studentClasses = new HashSet<Class>(0);

	public Student() {
	}

	public Student(Integer studentId, String studentName, String studentAge) {
		this.studentId = studentId;
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

	@ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinTable(name = "student_class", joinColumns = { @JoinColumn(name = "ID_STUDENT") }, inverseJoinColumns = {
			@JoinColumn(name = "CLASS_ID") })
	public Set<Class> getStudentClasses() {
		return studentClasses;
	}

	public void setStudentClasses(Set<Class> studentClasses) {
		this.studentClasses = studentClasses;
	}
}
