package com.deloitte.payroll;

public class Accounts {
	public void processSalary(Employee employee) { //give generalized type here
		//so that we don't have to repeat the same method having ConfirmedEmployee and then
		//Interns and then ContractEmployees
		//So it is called a polymorphic argument
		if(employee!=null) {
			if(employee instanceof ConfirmedEmployee) { //testing type of object
				ConfirmedEmployee confirmedEmployee= (ConfirmedEmployee) employee; //casting the reference
				confirmedEmployee.transportFacility();  
			}
				employee.netSalary();
		
	}
}
}

