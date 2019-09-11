package com.h2kinfosys.learnJava.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.LinkedList;

public class MyFirstConnection {
	

	private static String selectQuery = "select * from Actor";
	private static String selectWithCondition = "select * from Actor "
			+ "where actor_id > ? and first_name like ?";
	private static String insertQuery = "INSERT INTO actor(first_name, last_name, last_update) VALUES (?, ?, CURRENT_TIMESTAMP)";
	private static String updatequery = "Update Actor set last_name = ? where actor_id = ?";
	private static String deleteQuery = "Delete from Actor where actor_id = ?";
	/* 
	 * DB Parameters : 
	 * Host: localhost 
	 * Port: 3306
	 * User: root
	 * Password : password
	 */
	public static void main(String[] args) throws SQLException {
		//testSelectQuery(selectQuery);
		//testSelectWithCondition(selectWithCondition, 120, "A%");
		// Ask Query to fetch the result
		ActorDTO actor = new ActorDTO();
		actor.setFirstName("DAVID");
		actor.setLastName("NIX");
		//createActor(actor);
		updateLastName("BULSON", 5);
		//deleteActorWithActorId(202);
		//testSelectQuery(selectQuery);
		// Handle error in case of any issues
	}

	public static void deleteActorWithActorId(int actorId) {
		Connection connection = null;
		try {
			connection = DBUtil.getConnection();
			// Ask Connection to execute my query - Statement
			PreparedStatement pStat = connection.prepareStatement(deleteQuery);
			pStat.setInt(1, actorId);
			
			int numberOfRowsAffected = pStat.executeUpdate(); // this will execute the query against connection
			
			System.out.println("Number of Rows inserted :: " + numberOfRowsAffected);
			
			connection.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		
	}
	
	public static void updateLastName(String lastName, int actorId) throws SQLException {
		Connection connection = null;
		try {
			connection = DBUtil.getConnection();
			connection.setAutoCommit(false);
			// Ask Connection to execute my query - Statement
			PreparedStatement pStat = connection.prepareStatement(updatequery);
			pStat.setString(1, lastName);
			pStat.setInt(2, actorId);
			
			int numberOfRowsAffected = pStat.executeUpdate(); // this will execute the query against connection
			
			if(numberOfRowsAffected > 0) {
				connection.commit();
			}
			
			System.out.println("Number of Rows inserted :: " + numberOfRowsAffected);
			
			connection.close();
		} catch (SQLException e) {
			connection.rollback();
			e.printStackTrace();
		}
	
		
	}
	
	
	public static void createActor(ActorDTO actor) {
		Connection connection = null;
		try {
			connection = DBUtil.getConnection();
			// Ask Connection to execute my query - Statement
			PreparedStatement pStat = connection.prepareStatement(insertQuery);
			pStat.setString(1, actor.getFirstName());
			pStat.setString(2, actor.getLastName());
			
			int numberOfRowsAffected = pStat.executeUpdate(); // this will execute the query against connection
			
			System.out.println("Number of Rows inserted :: " + numberOfRowsAffected);
			
			connection.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		
	}
	
	
	public static void testSelectWithCondition(String query, int actorId, String firstNameLike) {
		Connection connection = null;
		try {
			connection = DBUtil.getConnection();
			// Ask Connection to execute my query - Statement
			PreparedStatement pStat = connection.prepareStatement(query);
			pStat.setInt(1, actorId);
			pStat.setString(2, firstNameLike);
			ResultSet rs = pStat.executeQuery(); // this will execute the query against connection
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
		}
	
		
	}
	
	
	public static void testSelectQuery(String query) {
		Connection connection = null;
		try {
			connection = DBUtil.getConnection();
			// Ask Connection to execute my query - Statement
			//Statement stat = connection.createStatement(ResultSet.TYPE_FORWARD_ONLY, ResultSet.CONCUR_READ_ONLY); // create an object to send query to DB
			
			Statement rsStat = connection.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE );
			
			ResultSet rs = rsStat.executeQuery(query); // this will execute the query against connection
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
					
					int rowId = rs.getRow();
					if(rowId == 6) {
						rs.updateString("first_name", "DAVE");
						rs.updateRow(); // command to update row - in DB
					}
					
					
					
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
		}
	}
}
