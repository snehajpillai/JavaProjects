package com.deloitte.main;

class IllegalAgeException extends Exception {
	@Override 
	public String getMessage() {
		// TODO Auto-generated method stub
		return "You're not above 18!!";
	}
}

	
class Voter {
	public void register(int age) throws IllegalAgeException {
		if(age<18) {
			throw new IllegalAgeException();		
			}
		}
	}

public class MainClass {

	public static void main(String[] args) {
		Voter voter= new Voter();
		try {
			voter.register(2);
		} catch (IllegalAgeException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
