package com.wisdom.demo;

import com.wisdom.manager.EmployeeManager;
import com.wisdom.entity.Employee;

public class Demo {
	EmployeeManager manager = null;

	public Demo() {
		manager = new EmployeeManager();
	}

	public void saveData() {
		Employee employee = new Employee();
		employee.setId(100);
		employee.setFirstName("Asela");
		employee.setLastName("Liyanage");
		employee.setSalary(10000);
		boolean saveState = manager.saveEmployeeData(employee);
		System.out.println("--saveState-->" + saveState);
	}

	public static void main(String[] args) {
		Demo demo = new Demo();
		demo.saveData();
	}
}