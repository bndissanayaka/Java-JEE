package com.wisdom.action;

import javax.servlet.http.*;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionForward;
import com.wisdom.form.RegistrationForm;

import entity.Employee;
import manager.EmployeeManager;

public class RegisterAction extends org.apache.struts.action.Action {
	private final static String SUCCESS = "success";
	private final static String FAILURE = "failure";

	public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		RegistrationForm loginForm = (RegistrationForm) form;
		
		EmployeeManager manager = new EmployeeManager();
	
		Employee employee = new Employee();
		employee.setId(100);
		employee.setFirstName("Asela");
		employee.setLastName("Liyanage");
		employee.setSalary(10000);
		boolean saveState = manager.saveEmployeeData(employee);
		
        if (loginForm.getUsername().equals(loginForm.getPassword())) {
			return mapping.findForward(SUCCESS);
		} else {
			return mapping.findForward(FAILURE);
		}
	}
}
