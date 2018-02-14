package com.wisdom.form;
import org.apache.struts.action.ActionForm;

import entity.Employee;

public class RegistrationForm extends ActionForm {
	
	String username;
	String password;
	
	Employee emp = new Employee();
   
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	

}
