package com.wisdom.test;

class DemoMyMain {
	
		public static void main(String args[]) {
			MyThread t1 = new MyThread("One");
			MyThread t2 = new MyThread("Two");
			MyThread t3 = new MyThread("Three");
			System.out.println("--One Befor-->" + t1.isAlive());
			System.out.println("--Two Befor-->" + t2.isAlive());
			System.out.println("--Three Befor-->" + t3.isAlive());
			t1.start();
			t2.start();
			t3.start();
			try {
				t1.join();
				t2.join();
				t3.join();
			} catch (InterruptedException e) {
			}
			System.out.println("--One After-->" + t1.isAlive());
			System.out.println("--Two After-->" + t2.isAlive());
			System.out.println("--Three After-->" + t3.isAlive());
			System.out.println("Exit Thread main");
		
	}
}