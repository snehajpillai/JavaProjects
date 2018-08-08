package com.deloitte.payroll;
//using getters and setters helps in Encapsulation to restrict read/write
public class Employee {
	private int empId;
	private String fName;
	private String lName;
	private int deptId;
	public int getEmpId() {
		return empId;
	}
	public String getfName() {
		return fName;
	}
	public String getlName() {
		return lName;
	}
	public int getDeptId() {
		return deptId;
	}
	public void setEmpId(int   empId) { //eclipse gives return type as void
		this.empId = empId;   //but it is a good practice to make it return boolean 
		//so now we can know if value has been set after checking condition or not
	}
	public void setfName(String fName) {
		this.fName = fName;
	}
	public void setlName(String lName) {
		this.lName = lName;
	}
	public void setDeptId(int deptId) {
		this.deptId = deptId;
	}
	

}
