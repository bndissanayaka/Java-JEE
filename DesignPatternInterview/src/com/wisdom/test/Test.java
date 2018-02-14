package com.wisdom.test;

public class Test implements Interface1 , Interface2{
	public static void main(String[] args) {

		System.out.println("main");
		Test t1 = new Test();
		t1.temp();
		t1.test();
	}

	@Override
	public void temp() {
		System.out.println("Inside temp class");
		
	}

	@Override
	public void test2() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void test() {
		// TODO Auto-generated method stub
		Interface2.super.test();
	}

	
	/*@Override
	public void test() {
		// TODO Auto-generated method stub
		Interface1.super.test();
	}
	*/

    
	/*public void test() {
		System.out.println("Overridden default method called");
	}*/

}
