package com.deloitte.web.model;

import java.io.Serializable;

public class UserBean implements Serializable {
	private String firstName;
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

	private String lastName;

	public Boolean authenticate(String username, String password) {
		if (username != null && password != null) {
			if (username.equalsIgnoreCase("sneha") && (password.equals("pass123"))) {
				firstName="sneha";
				lastName="pillai";		
				return true;
			} else {
				return false;

			}

		}
		return false;

	}
}
