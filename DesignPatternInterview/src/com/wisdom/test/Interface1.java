package com.wisdom.test;

public interface Interface1 {

	public default void test(){
		System.out.println("Testing default method");
	}
	
	public void temp();
}
