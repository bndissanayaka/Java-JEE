package com.wisdom.demo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Demo {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("Beans.xml");
		EmployeeDao ob = (EmployeeDao) ctx.getBean("edao");
		// int status = ob.saveEmployee(new Employee(1,"ann",20000));
		// boolean status = ob.saveEmployeeByPreparedStatement(new
		// Employee(3,"Max",25000));
		// System.out.println(status);
		
		//List<Employee> l = new ArrayList<Employee>();
		
		ob.save(new Employee(5,"annie",20000));

		/*for (Employee employee : l) {
			System.out.println(employee.getId());
			System.out.println(employee.getName());
			System.out.println(employee.getSalary());
		}*/
		
		/*Iterator<Employee> i = l.iterator();
		while (i.hasNext()) {
			Employee e = (Employee) i.next();
			System.out.println(e.getId());
			System.out.println(e.getName());
			System.out.println(e.getSalary());
			
		}*/
		
		/*for (Object employee : l) {
			Employee e1 = (Employee)employee;
			System.out.println(e1.getId());
			System.out.println(e1.getName());
			System.out.println(e1.getSalary());
		}*/
		
	}

}
