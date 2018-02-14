package com.wisdom.test;

public class A {
	private B b;
	
	public A(B b) {
		this.b = b; 
	}
	public void testA()
	{
		System.out.println("Inside testA");
		b.testB();
	}
	
}
