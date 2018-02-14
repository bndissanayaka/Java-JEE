package com.wisdom.lms.bean;

import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;
import javax.servlet.http.HttpServletRequest;
import java.util.Date ;
import java.sql.*;

@ManagedBean(name = "studentBean")
public class StudentBean {
	final String JDBC_DRIVER = "org.postgresql.Driver";
	final String DB_URL = "jdbc:postgresql://localhost/";
	final String USER = "postgres";
	final String PASS = "admin";
	
	private String pageLink;
	private String regNo;
	private String name;
	private String addrs;
	private String email;
	private int phnno;
	private String nic;
	private Date dob;

	@PostConstruct
	public void init() {

		HttpServletRequest request = (HttpServletRequest) FacesContext.getCurrentInstance().getExternalContext().getRequest();
		String reqParam = request.getParameter("create");

		System.out.println("--TestBean1-->" + reqParam);

		setPageLink(" Click " + reqParam);

	}
	public void submitData()
	{
		Connection con = null;
		Statement stmt = null;
		try {
			Class.forName(JDBC_DRIVER);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		System.out.println("Connecting to Database...");
		try {
			con = DriverManager.getConnection(DB_URL, USER, PASS);
			stmt = con.createStatement();
			/*String sql = "CREATE TABLE WISDOM.STUDENTLMS "+ "(name VARCHAR(100), "+ " reg_no VARCHAR(10) not NULL, "+" address VARCHAR(150), "+ " phn_no INTEGER, "
					+ " email VARCHAR(25), "
					+ " nic VARCHAR(25), "
					+ " date DATE, "
					+ " PRIMARY KEY ( nic ))";
			stmt.executeUpdate(sql);*/
			
			/*String sql1 = "INSERT INTO WISDOM.STUDENTS "+
					"VALUES ('binu', '15', 'Maharagama', 67890 ,'bndis@gmail.com', '8888908764v')";*/
					//stmt.executeUpdate(sql1);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			try {
			if (null != stmt) {
			stmt.close();
			}
			if (null != con) {
			con.close();
			}
			} catch (SQLException e) {
			e.printStackTrace();
			}
		}
		
	
		System.out.println("########### Successfully Submited Data ###########");
      
		FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO,"INFO:", "Sample info message"));
	}
	

	public String getPageLink() {
		return pageLink;
	}
	
	public void setPageLink(String pageLink) {
		this.pageLink = pageLink;
		System.out.println( pageLink+ ", ");
	}

	public String getRegNo() {
		return regNo;
	}

	public void setRegNo(String regNo) {
		this.regNo = regNo;
		System.out.println( regNo + ", ");
	}

	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
		System.out.println( name + ", ");
	}

	public String getAddrs() {
		return addrs;
	}

	public void setAddrs(String addrs) {
		this.addrs = addrs;
		System.out.println( addrs + ", ");
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
		System.out.println( email + ", ");
	}

	public int getPhnno() {
		return phnno;
	}

	public void setPhnno(int phnno) {
		this.phnno = phnno;
		System.out.println( phnno + ", ");
	}

	public String getNic() {
		return nic;
	}

	public void setNic(String nic) {
		this.nic = nic;
		System.out.println( nic + ", ");
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
		System.out.println( dob + ", ");
	}
}
