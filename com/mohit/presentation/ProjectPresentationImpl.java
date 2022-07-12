package com.mohit.presentation;

import java.util.ArrayList;
import java.util.Scanner;

import com.mohit.bean.Employee;
import com.mohit.bean.Project;
import com.mohit.service.ProjectServiceImpl;

public class ProjectPresentationImpl implements ProjectPresentation {

	private ProjectServiceImpl projectServiceImpl = new ProjectServiceImpl();
	@Override
	public void showMenu() {
		System.out.println("1. Show All Employees");
		System.out.println("2. Search Employee By ID");
		System.out.println("3. Add new Employee");
		System.out.println("4. Add new Project");
		System.out.println("5. View Employees allocated to a particular project");
		System.out.println("6. Add Employee to a particular project");
		System.out.println("7. Remove Employee from a particular project");
		System.out.println("8. Exit");

	}

	@Override
	public void performMenu(int choice) {
		Scanner scanner =new Scanner(System.in);
		switch (choice) {
		case 1:
			ArrayList<Employee> employees=projectServiceImpl.getAllEmployees();
			for(Employee employee:employees) {
				System.out.println(employee.getEmpId()+"  "+employee.getEmpName());
			}
			System.out.println("======================================");
			break;
		case 2:
			System.out.println("Enter Employee ID : ");
			int id=scanner.nextInt();
			Employee empl=projectServiceImpl.searchRecordById(id);
			if(empl!=null) {
				System.out.println(empl.getEmpId()+"  "+empl.getEmpName());
			}
			else
				System.out.println("Employee with id "+id+" does not exist");
			break;
		case 3:
			System.out.println("Enter Employee id :");
			int id1=scanner.nextInt();
			System.out.println("Enter Employee Name :");
			String name=scanner.next();
			
			Employee emp=new Employee(id1,name,true);
			boolean isAdded=projectServiceImpl.addEmployee(emp);
			if(isAdded==true) {
				System.out.println("Employee added successfully");
			}
			break;
		case 4:
			System.out.println("Enter project id");
			int pid=scanner.nextInt();
			System.out.println("Enter project name");
			String pname=scanner.next();
			Project project=new Project(pid,pname);
			boolean added=projectServiceImpl.addProject(project);
			if(added==false) {
				System.out.println("Error occured");
			}else {
				System.out.println("Added Successfully");
			}
			break;
		case 5:
			System.out.println("Enter project id");
			int pId=scanner.nextInt();
			Project project1=projectServiceImpl.searchProjectById(pId);
			if(project1 == null) {
				System.out.println("Invalid project id");
			}
			ArrayList<Employee> employeeList=projectServiceImpl.getEmployeesOfAProject(project1);
			for(Employee e:employeeList) {
				System.out.println(e);
			}
			break;
		case 6:
			System.out.println("Enter employee id");
			int eId=scanner.nextInt();
			System.out.println("Enter project id");
			int pid1=scanner.nextInt();
			boolean answer=projectServiceImpl.allocateEmployee(eId, pid1);
			if(answer==false) {
				System.out.println("Some error occured, Please try again");
			}else {
				System.out.println("Employee assigned to project successfully");
			}
			break;
		case 7:
			System.out.println("Work Under Construction");
			break;
		case 8:
			System.out.println("Thanks for using Employee Management System");
			System.exit(0);
		default:
			System.out.println("Invalid Choice");
	}
	}

}
