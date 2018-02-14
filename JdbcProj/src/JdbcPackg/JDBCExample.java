package JdbcPackg;

import java.sql.*;

public class JDBCExample {

	final String JDBC_DRIVER = "org.postgresql.Driver";
	final String DB_URL = "jdbc:postgresql://localhost/";
	final String USER = "postgres";
	final String PASS = "admin";

	public void insertRecode() {
		Connection con = null;
		PreparedStatement pstmt = null;
		try {
			Class.forName(JDBC_DRIVER);
			try {
				System.out.println("Connecting to Database...");
				con = DriverManager.getConnection(DB_URL, USER, PASS);
				System.out.println("Executing SQL...");
				String sql = "INSERT INTO WISDOM.STUDENTS " + "VALUES (?, ?, ?, ?, ?, ?)";
				pstmt = con.prepareStatement(sql);
				pstmt.setInt(1, 2);
				pstmt.setString(2, "Student 02");
				pstmt.setString(3, "Maharagama");
				pstmt.setInt(4, 25);
				pstmt.setString(5, "Colombo");
				pstmt.setString(6, "Sri lanka");
				int affectedRows = pstmt.executeUpdate();
				System.out.println(affectedRows + " row(s) affected !!");
				System.out.println("Recode Insert successfully...");
			} catch (SQLException e) {
				e.printStackTrace();
			} finally {
				try {
					if (null != pstmt) {
						pstmt.close();
					}
					if (null != con) {
						con.close();
					}
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		JDBCExample jdbcExample = new JDBCExample();
		jdbcExample.insertRecode();
	}

}
