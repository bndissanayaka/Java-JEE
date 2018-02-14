package com.wisdom.dbHandler;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import com.wisdom.pojo.Login;

public class DBHandler {
	public boolean loginOperation(Login login) {
		boolean success = false;
		Connection connection = DBConnection.getConnection();
		if (null != connection) {
			try {
				success = getUserData(connection, login);
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return success;
	}

	private boolean getUserData(Connection connection, Login login) throws SQLException {
		boolean success = false;
		String userName = "";
		String password = "";
		String query = "";
		ResultSet resultQuary = null;
		Statement stmt = null;
		try {
			if (null != connection && !connection.equals("")) {
				stmt = (Statement) connection.createStatement();
				query = "SELECT username, password FROM userlogindetails ";
				resultQuary = stmt.executeQuery(query);
				
				if (null != resultQuary && !resultQuary.equals("")) {
					loop: while (resultQuary.next()) {
						userName = resultQuary.getString("username");
						password = resultQuary.getString("password");
						System.out.println("---DB userName--->" + userName);
						System.out.println("---DB password--->" + password);
						if (login.getUserName().equals(userName.trim())
								&& login.getPassword().equals(password.trim())) {
							success = true;
							break loop;
						} else {
							success = false;
						}
					}
				}
			}
		} catch (SQLException e) {
			System.out.println("SQLException in executing time...." + e);
		} finally {
			resultQuary.close();
			stmt.close();
		}
		return success;
	}
}
