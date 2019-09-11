package com.h2kinfosys.learnJava.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.LinkedList;

public class MyFirstConnection {
	
	private static String url = "jdbc:mysql://localhost:3306/sakila";
	private static String userName = "root";
	private static String password = "password";
	private static String selectQuery = "select * from Actor";

	/* 
	 * DB Parameters : 
	 * Host: localhost 
	 * Port: 3306
	 * User: root
	 * Password : password
	 */
	public static void main(String[] args) {
		 
		try {
			// Step 1. Telling Java that I have Driver
			/* First way to load your driver - instantiate 
			 * Driver mysqlDriver = new Driver();
			 * DriverManager.registerDriver(mysqlDriver);
			 */
			// Reflection way most common - Class.forName("com.mysql.cj.jdbc.Driver")
			Class.forName("com.mysql.cj.jdbc.Driver");
			// Step 2 : Ask Driver to get a connection
			Connection connection =  DriverManager.getConnection(url, userName, password);
			// Ask Connection to execute my query - Statement
			Statement stat = connection.createStatement(); // create an object to send query to DB
			ResultSet rs = stat.executeQuery(selectQuery); // this will execute the query against connection
			// Use executeQuery --> for select statements
			// rs.next() --> if next row exists - returns true otherwise false
			ActorDTO actor = null;
			LinkedList<ActorDTO> actors = new LinkedList<ActorDTO>();
			if(rs != null) {
				while(rs.next()) {
					actor = new ActorDTO();
					actor.setActorId(rs.getInt("actor_id"));
					actor.setFirstName(rs.getString("first_name"));
					actor.setLastName(rs.getString("last_name"));
					actor.setTs(rs.getTimestamp("last_update"));
					//SimpleDateFormat format = new SimpleDateFormat("mmDDyyyy");
					actors.add(actor);
				}
			}else {
				System.out.println("No ResultSet generated");
			}
			if (actors.size() > 0) {
				for(ActorDTO eachActor : actors) {
					System.out.println("ActorID : " + eachActor.getActorId() 
								+ "  FirstName : " +  eachActor.getFirstName()
								+ " LastName : " +  eachActor.getLastName());
				}
			}
			connection.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		

		
		
		
		
		
		// Ask Query to fetch the result
		
		// Handle error in case of any issues
	}

}
