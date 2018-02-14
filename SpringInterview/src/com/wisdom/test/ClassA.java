package com.wisdom.test;

public class ClassA {

	private ClassB classb1;

	public ClassB getClassb1() {
		return classb1;
	}

	public void setClassb1(ClassB classb) {
		this.classb1 = classb;
	}
	
	public void methodClassA() {
		System.out.println("Inside class A");
		classb1.methodClassB();
	}
}
