package com.wisdom.struts2;

import com.opensymphony.xwork2.ActionSupport;

public class LoginAction extends ActionSupport{
	private String regNo;
	private String name;
	private String address;
	private String tel;

	public String execute() throws Exception {
		if (this.regNo.equals("123") && this.name.equals("abc")) {
			return "success";
		} else {
			addActionError(getText("error.login"));
			return "error";
		}
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public String getRegNo() {
		return regNo;
	}

	public void setRegNo(String regno) {
		this.regNo = regno;
	}
}