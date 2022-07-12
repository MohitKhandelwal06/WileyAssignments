package com.mohit.bean;

public class Employee {

	private int empId;
	private String empName;
	private boolean availablity;
	
	public Employee() {
		
	}
	
	public Employee(int empId, String empName, boolean availablity) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.availablity = availablity;
	}
	
	public int getEmpId() {
		return empId;
	}
	
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	
	public String getEmpName() {
		return empName;
	}
	
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	
	public boolean isAvailablity() {
		return availablity;
	}
	
	public void setAvailablity(boolean availablity) {
		this.availablity = availablity;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", availablity=" + availablity + "]";
	}
	
	
}
