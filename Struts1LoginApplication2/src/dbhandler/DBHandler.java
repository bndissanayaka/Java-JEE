package dbhandler;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;



public class DBHandler {

	final String JDBC_DRIVER = "org.postgresql.Driver";
	final String DB_URL = "jdbc:postgresql://localhost/";
	final String USER = "postgres";
	final String PASSWORD = "admin";
	Statement stmt = null;
	Connection con = null;
	ResultSet rs = null;
	String username;
	String password;
	boolean result;

	public boolean handelConnection(Login user) {
		try {
			Class.forName(JDBC_DRIVER);
			con = DriverManager.getConnection(DB_URL, USER, PASSWORD);
		} catch (ClassNotFoundException e) {
			System.out.println("Class loading exception");
		} catch (SQLException e) {
			System.out.println("Connection creation exception");
		}

		try {
			if (null != con) {
				stmt = con.createStatement();
				String sql = "SELECT username, password FROM userdata";
				rs = stmt.executeQuery(sql);
			}

			loop: while (rs.next()) {

				username = rs.getString("username");
				password = rs.getString("password");
				String uname = user.getUsername();
				String pwrd = user.getPassword();
				
				if (uname.equals(username) && pwrd.equals(password)) {
					result = true;
					break loop;
				} else
					result = false;
			}
		} catch (SQLException e) {

			e.printStackTrace();
		}
		return result;
	}

}
