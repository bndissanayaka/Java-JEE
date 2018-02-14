package demo.test;

class Demo {
	public static void main(String args[]) {
		String months[] = new String[12];
		System.out.println("--Test 01--");
		try {
			months[12] = "December";
		} catch (Exception e) {
			System.out.println("Array Index Exception");
		}
		System.out.println("--Test 02--");
	}
}