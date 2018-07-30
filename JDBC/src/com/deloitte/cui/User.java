package com.deloitte.cui;

public class User {
	int id;
	private String userName;
	private String passwd;
	private String firstName;
	private String lastName;
	private String status;
	public User(int id, String userName, String firstName,String lastName, String passwd, String status) {
		this.id=id;
		this.userName=userName;
		this.firstName=firstName;
		this.lastName=lastName;
		this.passwd=passwd;
		this.status=status;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPasswd() {
		return passwd;
	}
	public void setPasswd(String password) {
		this.passwd = passwd;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
}

