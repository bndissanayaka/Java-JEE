package com.wisdom.spring.demo;

public class HelloWorld {
	private String message;

	public void init()
	{
		System.out.println("Inside init");
		
	}
	public void setMessage(String message) {
		this.message = message;
	}

	public void getMessage() {
		System.out.println("Your Message : " + message);
	}
}