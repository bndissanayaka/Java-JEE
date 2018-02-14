package com.wisdom.bean;

import java.io.Serializable;
import java.util.List;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;
import com.wisdom.entity.Employee;
import com.wisdom.mngr.EmployeeManager;

@ManagedBean(name = "EmployeeBean")
@ViewScoped
public class EmployeeBean implements Serializable{
	private String id;
	private String firstName;
	private String lastName;
	private String salary;

	public void submitData() {
		Employee employee = new Employee();
		employee.setId(Integer.parseInt(getId()));
		employee.setFirstName(getFirstName());
		employee.setLastName(getLastName());
		employee.setSalary(Integer.parseInt(getSalary()));
		EmployeeManager employeeManager = new EmployeeManager();
		employeeManager.saveEmployeeData(employee);
		
		List<Employee> empList = employeeManager.viewData();
		for (Employee employee2 : empList) {
			System.out.println(employee2.getFirstName());
		}
		System.out.println("Employee Successfully Saved");
		FacesContext.getCurrentInstance().addMessage(null,
				new FacesMessage(FacesMessage.SEVERITY_INFO, "", " Employee Successfully Saved"));
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getSalary() {
		return salary;
	}

	public void setSalary(String salary) {
		this.salary = salary;
	}
}
