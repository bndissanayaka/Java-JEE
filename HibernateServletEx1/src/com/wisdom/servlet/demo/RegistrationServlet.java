package com.wisdom.servlet.demo;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.wisdom.entity.Employee;
import com.wisdom.mngr.EmployeeManager;


public class RegistrationServlet extends HttpServlet {
	/*private String id;
	private String fname;
	private String lname;
	private String salary;*/

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String id = request.getParameter("id");
		String fname = request.getParameter("fname");
		String lname = request.getParameter("lname");
		String salary = request.getParameter("salary");
		
		Employee employee = new Employee();
		employee.setId(id);
		employee.setFirstName(fname);
		employee.setLastName(lname);
		employee.setSalary(salary);
		EmployeeManager employeeManager = new EmployeeManager();
		employeeManager.saveEmployeeData(employee);
		/*System.out.println("--firstName-->" + firstName);
		System.out.println("--lastName-->" + lastName);
		System.out.println("--email-->" + email);
		System.out.println("--userName-->" + userName);
		System.out.println("--password-->" + password);
		String fullName = firstName + " " + lastName;*/
		//request.setAttribute("full_name", fullName);
		//RequestDispatcher requestDispatcher = getServletContext().getRequestDispatcher("/jsp/success.jsp");
		//RequestDispatcher requestDispatcher = request.getRequestDispatcher("/jsp/success.jsp");
		//requestDispatcher.forward(request, response);
		
	}
	/*public String getId() {
		return id;
	}


	public void setId(String id) {
		this.id = id;
	}


	public String getFname() {
		return fname;
	}


	public void setFname(String fname) {
		this.fname = fname;
	}


	public String getLname() {
		return lname;
	}


	public void setLname(String lname) {
		this.lname = lname;
	}


	public String getSalary() {
		return salary;
	}


	public void setSalary(String salary) {
		this.salary = salary;
	}
*/
	
	
}