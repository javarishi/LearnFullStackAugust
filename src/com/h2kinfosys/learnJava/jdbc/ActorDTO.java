package com.h2kinfosys.learnJava.jdbc;

import java.sql.Timestamp;

// Beans 
// Persistent classes
// POJO
// Accessory
// Data Transfer Objects
// Transfer objects 
// Model classes
public class ActorDTO {
	private String firstName = null;
	private String lastName = null;
	private Timestamp ts = null;
	private int actorId = 0;
	
	public ActorDTO() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName;
	}

	/**
	 * @param lastName the lastName to set
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	/**
	 * @return the ts
	 */
	public Timestamp getTs() {
		return ts;
	}

	/**
	 * @param ts the ts to set
	 */
	public void setTs(Timestamp ts) {
		this.ts = ts;
	}

	/**
	 * @return the actorId
	 */
	public int getActorId() {
		return actorId;
	}

	/**
	 * @param actorId the actorId to set
	 */
	public void setActorId(int actorId) {
		this.actorId = actorId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	
	
	
}
