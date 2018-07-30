package com.deloitte.cui;

public class MainClass {

	public static void main(String[] args) {
		UserDAO udao= new UserDAO();
	User user= new User(1, "sneha", "Sneha", "J Pillai", "pass123", "E");
	udao.save(user);
	}

}
