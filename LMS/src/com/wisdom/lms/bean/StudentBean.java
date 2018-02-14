package com.wisdom.lms.bean;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;
import javax.servlet.http.HttpServletRequest;

import com.wisdom.lms.pojo.Student;
import com.wisdom.mngr.StudentManager;

@ManagedBean(name = "studentBean")
@ViewScoped
public class StudentBean {

	private Student student;
	public List<Student> studDisplayList = new ArrayList<Student>();

	@PostConstruct
	public void init() {
		try {

			HttpServletRequest request = (HttpServletRequest) FacesContext.getCurrentInstance().getExternalContext().getRequest();
			String reqParam = request.getParameter("param");

			System.out.println("reqParam is : " + reqParam);

			if (reqParam != null && !reqParam.isEmpty()) {
				
				if(reqParam.equalsIgnoreCase("create")){
				
				}else if(reqParam.equalsIgnoreCase("view")){
					StudentManager sm = new StudentManager();
					setStudDisplayList(sm.viewData());
								
				}else{
					System.out.println("Undofined Req Type");
				}
			} else {
				System.out.println("Invalid Rweq Param ");
			}
		} catch (Exception e) {
			System.out.println("Init Fail: " + e);
		}
	}

	public void submitData() {
		System.out.println("Successfully Submitted");
		StudentManager sm = new StudentManager();
	    boolean saveState = sm.createData(student);
		 
	}


	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	public List<Student> getStudDisplayList() {
		return studDisplayList;
	}

	public void setStudDisplayList(List<Student> studDisplayList) {
		this.studDisplayList = studDisplayList;
	}

}
