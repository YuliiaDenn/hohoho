package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Dao {

	private final String URL = "jdbc:mysql://localhost:3306/notepad?serverTimezone=Europe/Kiev";
	private final String PASSWORD = "root";
	private final String USER = "root";

	static {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver"); // load class
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

	public Connection getConnection() {

		Connection conn = null;
		try {
			conn = DriverManager.getConnection(URL, USER, PASSWORD);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return conn;
	}
}
