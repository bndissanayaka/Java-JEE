package com.wisdom.entity;

import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "class")
public class Class implements java.io.Serializable {
	private static final long serialVersionUID = 1L;
	private Integer classID;
	private String title;
	private String semester;
	private Set<Student> assignedStudents = new HashSet<Student>(0);

	public Class(Integer classID, String title, String semester) {
		this.classID = classID;
		this.title = title;
		this.semester = semester;
	}

	@Id
	@Column(name = "CLASS_ID")
	public Integer getClassID() {
		return classID;
	}

	public void setClassID(Integer classID) {
		this.classID = classID;
	}

	@Column(name = "TITLE")
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	@Column(name = "SEMESTER")
	public String getSemester() {
		return semester;
	}

	public void setSemester(String semester) {
		this.semester = semester;
	}

	@ManyToMany(fetch = FetchType.LAZY, mappedBy = "studentClasses")
	public Set<Student> getAssignedStudents() {
		return assignedStudents;
	}

	public void setAssignedStudents(Set<Student> assignedStudents) {
		this.assignedStudents = assignedStudents;
	}
}
