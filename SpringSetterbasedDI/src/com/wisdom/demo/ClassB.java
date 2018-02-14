package com.wisdom.demo;

public class ClassB {
	private ClassA name;

	public void checkB() {
		System.out.println("Inside checkB() ");
        name.checkA();
	}

	public ClassA getName() {
		return name;
	}

	public void setName(ClassA name) {
		this.name = name;
	}
	

}
