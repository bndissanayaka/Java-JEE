package com.wisdom.db;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.wisdom.db.DBConnection;
import com.wisdom.pojo.User;

public class DBConnectionHandler {

	/*dbHandlerLogin() handles the logic for login servlet.
	*if the username and password user enters already exists in database, login will fail and will be redirected to loginFail.jsp
	*if not user will redirected to registration.jsp*/
	
	public boolean dbHandlerLogin(User user) {
		Statement stmt = null;
		Connection con = null;
		String username = "";
		String password = "";
		Boolean result = false;
		ResultSet rs = null;
		DBConnection dbcon = new DBConnection();

		con = dbcon.getConnection();
		if (null != con) {
			try {
				stmt = con.createStatement();
				String sql = "SELECT username, password FROM userdata";
				rs = stmt.executeQuery(sql);
			} catch (SQLException e) {
				
				e.printStackTrace();
			}
		}

		System.out.println("result set rs" + rs);
		if (rs != null && !rs.equals("")) {
			try {
				loop: while (rs.next()) {
					username = rs.getString("username");
					password = rs.getString("password");
					String uname = user.getUsername();
					String pward = user.getPassword();
					
					if (uname.equals(username) && pward.equals(password)) {
						result = true;
						break loop;
					} else
						result = false;
				}
			} catch (SQLException e) {
				System.out.println("Sql exception when looping");
			}
		}
		try {
			stmt.close();
			con.close();
		} catch (SQLException e) {
			System.out.println("Connection and statement closing exception");
		}
		return result;
	}

	/*dbHandlerRegister() handles the logic for registration servlet.
	*if the student_id and NIC no user enters already exists in database, that means user have already registered in the site.
	*So registering will fail and will be redirected to regFail.jsp. 
	*if not user will redirected to regSuccess.jsp*/
	
	public boolean dbHandlerRegister(User user) {
		boolean result = false;
		Statement stmt = null;
		Connection con = null;

		String nic = "";
		String studId = "";
		PreparedStatement pstmt = null;
		DBConnection dbcon = new DBConnection();

		try {
			con = dbcon.getConnection();
			stmt = con.createStatement();
			String sql = "SELECT stud_id,nic FROM registerdusers";
			ResultSet resultQuary = stmt.executeQuery(sql);
			loop:while (resultQuary.next()) {

				nic = resultQuary.getString("nic");
				studId = resultQuary.getString("stud_id");
				
				if (nic.equals(user.getNicNo()) && studId.equals(user.getStudId())) {
					result = false;
					break loop;
				} else {
					String query = "INSERT INTO registerdusers " + "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
					pstmt = con.prepareStatement(query);

					pstmt.setString(1, user.getFname());
					pstmt.setString(2, user.getLname());
					pstmt.setString(3, user.getAge());
					pstmt.setString(4, user.getStudId());
					pstmt.setString(5, user.getNicNo());
					pstmt.setString(6, user.getDob());
					pstmt.setString(7, user.getAddress());
					pstmt.setString(8, user.getTelNo());
					pstmt.setString(9, user.getCountry());
					pstmt.setString(10, user.getCity());
					pstmt.setString(11, user.getOther());
					pstmt.executeUpdate();
					
					/*int affectedRows = pstmt.executeUpdate();
					System.out.println(affectedRows + " row(s) affected !!");*/
					result = true;
				}

			}
		} catch (SQLException e) {
			System.out.println("SQLException ");
			e.printStackTrace();
		}
		try {
			stmt.close();
			con.close();
		} catch (SQLException e) {
			System.out.println("Connection and statement closing exception");
		}
		return result;

	}
}
