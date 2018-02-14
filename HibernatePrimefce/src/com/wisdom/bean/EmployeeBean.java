package com.wisdom.bean;

import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import com.wisdom.entity.Employee;
import com.wisdom.manager.EmployeeManager;

@ManagedBean(name = "EmployeeBean")
@ViewScoped
public class EmployeeBean {

	private List<Employee> empDisplayList = new ArrayList<Employee>();

	public EmployeeBean() {
		EmployeeManager employeeManager = new EmployeeManager();
		empDisplayList = employeeManager.loadEmployeeList();
	}

	public List<Employee> getEmpDisplayList() {
		return empDisplayList;
	}

	public void setEmpDisplayList(List<Employee> empDisplayList) {
		this.empDisplayList = empDisplayList;
	}

}