package com.deloitte.payroll;

public class ConfirmedEmployee extends Employee {

	@Override
	public void netSalary() {
		// TODO Auto-generated method stub
		System.out.println("Confirmed Employee's salary");
	}
public void transportFacility() { //only for confirmed employees
	System.out.println("Transportation");
}

}
