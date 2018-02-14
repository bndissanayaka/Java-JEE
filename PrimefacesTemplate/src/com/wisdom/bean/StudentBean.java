package com.wisdom.bean;

import java.util.Date;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import com.wisdom.entity.Student;
import com.wisdom.manager.DBHandler;

@ManagedBean(name = "studentBean")
@ViewScoped
public class StudentBean {

	private int stuid;
	private String firstName;
	private String lastName;
	private Date dob;
	private String nic;
	private String email;
	private String telno;
	private String address;
	
		
	/*@PostConstruct
	public void init() {

		HttpServletRequest request = (HttpServletRequest) FacesContext.getCurrentInstance().getExternalContext().getRequest();
		String reqParam = request.getParameter("param");
		
		
		System.out.println("--reqParam-->" + reqParam);
		if (reqParam != null && reqParam != "") {
			if (reqParam == "page1") {
		System.out.println("page1");
				
				
			}
		}

		Map<String, String> params = FacesContext.getCurrentInstance().getExternalContext().getRequestParameterMap();

		System.out.println("--params-->" + params);
		String action = params.get("param");
		System.out.println("--action-->" + action);

	}*/
		
	public void submitData()
	{
		Student student = new Student();

		student.setStuid(stuid);
		student.setfName(firstName);
		student.setlName(lastName);
		student.setDob(dob);
		student.setNic(nic);
		student.setEmail(email);
		student.setTelno(telno);
		student.setAddress(address);
		
		DBHandler dbHandler = new DBHandler();
		dbHandler.saveStudent(student);
		
	}
	
	public int getStuid() {
		return stuid;
	}

	public void setStuid(int stuid) {
		this.stuid = stuid;
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

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	public String getNic() {
		return nic;
	}

	public void setNic(String nic) {
		this.nic = nic;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTelno() {
		return telno;
	}

	public void setTelno(String telno) {
		this.telno = telno;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	

}
