package com.wisdom.test;

class MyThread extends Thread {
	MyThread(String s) {
		setName(s);
	}

	public void run() {
		for (int i = 10; i > 0; i--) {
			try {
				System.out.println(getName() + " " + i);
				Thread.sleep(200);
			} catch (InterruptedException ex) {
				System.out.println("Error " + ex);
			}
		}
		System.out.println("Existing thread : " + getName());
	}
}