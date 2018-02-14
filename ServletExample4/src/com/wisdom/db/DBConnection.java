package com.wisdom.db;

import java.sql.*;

public class DBConnection {

	final String JDBC_DRIVER = "org.postgresql.Driver";
	final String DB_URL = "jdbc:postgresql://localhost/";
	final String USER = "postgres";
	final String PASSWORD = "admin";

	Connection con = null;

	public Connection getConnection() {
		try {
			Class.forName(JDBC_DRIVER);
			con = DriverManager.getConnection(DB_URL, USER, PASSWORD);
		} catch (ClassNotFoundException e) {
			System.out.println("Class loading exception");
		} catch (SQLException e) {
			System.out.println("Connection creation exception");
		}

		return con;

	}
}