package com.fruit.usermanagement.backend.bean;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;

@Entity( name = "users" )
public class User {
	
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private Long id;
	
	private String firstName;
	
	private String lastName;
	
	private String emailAddress;
	
	private boolean isAdmin;
	
	@ManyToOne()
	@JoinColumn( name = "facility_id", nullable = false )
	private Facility facility;

	public User( String firstName, String lastName, String emailAddress, boolean isAdmin, Facility facility) {

		super();
		
		this.firstName = firstName;
		this.lastName = lastName;
		this.emailAddress = emailAddress;
		this.isAdmin = isAdmin;
		this.facility = facility;
		
	}

	public User(){
		super();
	}

	public Long getId() {
		return id;
	}

	public void setId( Long id ) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName( String firstName ) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName( String lastName ) {
		this.lastName = lastName;
	}

	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress( String emailAddress ) {
		this.emailAddress = emailAddress;
	}

	public boolean isAdmin() {
		return isAdmin;
	}

	public void setAdmin( boolean isAdmin ) {
		this.isAdmin = isAdmin;
	}
	
	public Facility getFacility() {
		return facility;
	}

	public void setFacility( Facility facility ) {
		this.facility = facility;
	}
	
	public String toString() {
		return "User [id=" + id + ", firstName=" + firstName + ", "
				+ "lastName=" + lastName + 
				", emailAddress=" + emailAddress + ", isAdmin=" + isAdmin + "]";
	}
	
	
}
