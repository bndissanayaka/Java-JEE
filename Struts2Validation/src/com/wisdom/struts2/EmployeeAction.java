package com.wisdom.struts2;

import com.opensymphony.xwork2.ActionSupport;

public class EmployeeAction extends ActionSupport {
	private static final long serialVersionUID = 1L;
	private String name;
	private Integer age;
	private String email;
	private String telephone;

	public String addEmployee() {
		return SUCCESS;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}
}
