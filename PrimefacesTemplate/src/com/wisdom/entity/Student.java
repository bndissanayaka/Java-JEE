package com.wisdom.entity;

import java.util.Date;
import javax.persistence.*;

@Entity
@Table(name = "STUDENT")
public class Student {
	
	@Id
	@Column(name = "stud_id")
	private int stuid;
	
	@Column(name = "first_name")
	private String fName;
	
	@Column(name = "last_name")
	private String lName;
	
	@Column(name = "dob")
	private Date dob;
	
	@Column(name = "nic")
	private String nic;
	
	@Column(name = "email")
	private String email;
	
	@Column(name = "phone_no")
	private String telno;
	
	@Column(name = "address")
	private String address;
	
	
	public int getStuid() {
		return stuid;
	}

	public void setStuid(int stuid) {
		this.stuid = stuid;
	}

	public String getfName() {
		return fName;
	}

	public void setfName(String fName) {
		this.fName = fName;
	}

	public String getlName() {
		return lName;
	}

	public void setlName(String lName) {
		this.lName = lName;
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
