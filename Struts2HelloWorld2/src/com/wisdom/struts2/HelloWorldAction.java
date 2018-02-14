package com.wisdom.struts2;

public class HelloWorldAction {
	private String name;

	
	public String test() throws Exception {
		return "success";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
