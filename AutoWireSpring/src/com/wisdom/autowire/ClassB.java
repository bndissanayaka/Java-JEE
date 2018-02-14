package com.wisdom.autowire;

public class ClassB {
	private ClassA classAPop;

	public ClassA getClassAPop() {
		return classAPop;
	}

	public void setClassAPop(ClassA classAPrp) {
		this.classAPop = classAPrp;
	}
	
	public void checkAutoWire()
	{
		System.out.println("Inside B");
		System.out.println(classAPop.getName());
	}

}
