package com.mohit.persistence;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

import com.mohit.bean.Employee;
import com.mohit.bean.Project;

public interface ProjectDao {
	boolean addEmployee(Employee employee);
	ArrayList<Employee> getEmployeeList();
	void setEmployeeList(ArrayList<Employee> employeeList);
	HashSet<Project> getProjectList();
	void setProjectList(HashSet<Project> projectList);
	boolean addProject(Project project);
	boolean allocateEmployee();
	boolean deAllocateEmployee();
	HashMap<Project, ArrayList<Employee>> getProjectWiseEmployeeList();
	void setProjectWiseEmployeeList(HashMap<Project, ArrayList<Employee>> projectWiseEmployeeList);
}
