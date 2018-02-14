package com.wisdom.test;

public interface Interface2 {

	public default void test(){
		System.out.println("Testing default method interface2");
	}
	
	public void test2();
}
