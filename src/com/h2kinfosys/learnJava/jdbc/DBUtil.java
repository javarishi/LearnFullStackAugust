package com.h2kinfosys.learnJava.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBUtil {
	private static String url = "jdbc:mysql://localhost:3306/sakila";
	private static String userName = "root";
	private static String password = "password";
	
	public static Connection getConnection() throws SQLException{
		// Step 1. Telling Java that I have Driver
		/* First way to load your driver - instantiate 
		 * Driver mysqlDriver = new Driver();
		 * DriverManager.registerDriver(mysqlDriver);
		 */
		// Reflection way most common - Class.forName("com.mysql.cj.jdbc.Driver")
		Connection connection = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			// Step 2 : Ask Driver to get a connection
			connection =  DriverManager.getConnection(url, userName, password);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return connection;

	}

}
