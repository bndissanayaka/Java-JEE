package com.wisdom.demo;

public class SingletonClass implements Cloneable{
	private static SingletonClass singletonObject;

	private SingletonClass() {

	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
		
	};
	
	public synchronized static SingletonClass getSingletonObject() {
		if (singletonObject == null) {
			singletonObject = new SingletonClass();
			
		}
		return singletonObject;
	}

}
