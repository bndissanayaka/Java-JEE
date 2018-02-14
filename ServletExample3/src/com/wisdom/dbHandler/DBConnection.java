package com.wisdom.dbHandler;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
	String driverClass = "";
	String url = "";
	String dbuser = "";
	String dbpass = "";
	public Connection connection = null;
	private static DBConnection dbconnection = null;

	private DBConnection() {
		driverClass = "org.postgresql.Driver";
		url = "jdbc:postgresql://localhost/";
		dbuser = "postgres";
		dbpass = "admin";
		try {
			Class.forName(driverClass);
			connection = DriverManager.getConnection(url, dbuser, dbpass);
		} catch (ClassNotFoundException e) {
			System.out.println("ClassNotFoundException ......" + e);
		} catch (SQLException e) {
			System.out.println("SQLException in connecting time...." + e);
		}
	}

	public static Connection getConnection() {
		if (dbconnection == null) {
			dbconnection = new DBConnection();
		}
		return dbconnection.connection;
	}
}