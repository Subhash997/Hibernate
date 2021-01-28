package com.hotel.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="Hotel_DTO")

public class HotelDTO {
    @Id
	@Column(name="user_ID")
	private int UserID;
	@Column(name="Name")
	private String Name;
	@Column(name="EmailID")
	private String EmailID;
	
	public HotelDTO() {
		System.out.println(this.getClass().getSimpleName()+"Default constructor");
	}
	public HotelDTO(int userID, String Name, String EmailID ) {
		super();
		this.UserID=userID;
		this.Name=Name;
		this.EmailID=EmailID;
	}
	public int getUserID() {
		return UserID;
	}
	public void setUserID(int userID) {
		UserID = userID;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getEmailID() {
		return EmailID;
	}
	public void setEmailID(String emailID) {
		EmailID = emailID;
	}
	
	@Override
	public String toString() {
		return "HotelDTO [userID=" + UserID + ", Name=" + Name+ ",emailID=" + EmailID +"]";
		
		
	}
}
