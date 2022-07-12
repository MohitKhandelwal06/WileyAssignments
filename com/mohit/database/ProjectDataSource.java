package com.mohit.database;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

import com.mohit.bean.Employee;
import com.mohit.bean.Project;

public class ProjectDataSource {
	private static ArrayList<Employee> employeeList =new ArrayList<>();
	private static HashSet<Project> projectList =new HashSet<>();
	private static HashMap<Project,ArrayList<Employee>> projectWiseEmployeeList =new HashMap<>();
	public static ArrayList<Employee> getEmployeeList() {
		return employeeList;
	}
	public static void setEmployeeList(ArrayList<Employee> employeeList) {
		ProjectDataSource.employeeList = employeeList;
	}
	public static HashSet<Project> getProjectList() {
		return projectList;
	}
	public static void setProjectList(HashSet<Project> projectList) {
		ProjectDataSource.projectList = projectList;
	}
	public static HashMap<Project, ArrayList<Employee>> getProjectWiseEmployeeList() {
		return projectWiseEmployeeList;
	}
	public static void setProjectWiseEmployeeList(HashMap<Project, ArrayList<Employee>> projectWiseEmployeeList) {
		ProjectDataSource.projectWiseEmployeeList = projectWiseEmployeeList;
	}
	
	
}
