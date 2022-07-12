package com.mohit.persistence;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

import com.mohit.bean.Employee;
import com.mohit.bean.Project;
import com.mohit.database.ProjectDataSource;

public class ProjectDaoImpl implements ProjectDao {
	
	@Override
	public boolean addEmployee(Employee employee) {
		ArrayList<Employee> employeeList=ProjectDataSource.getEmployeeList();
		employeeList.add(employee);
		ProjectDataSource.setEmployeeList(employeeList);
		return true;
	}

	@Override
	public boolean addProject(Project project) {
		HashSet<Project> projectList=ProjectDataSource.getProjectList();
		projectList.add(project);
		ProjectDataSource.setProjectList(projectList);
		return true;
	}

	@Override
	public boolean allocateEmployee() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deAllocateEmployee() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public ArrayList<Employee> getEmployeeList() {
		ArrayList<Employee> employeeList=ProjectDataSource.getEmployeeList();
		return employeeList;
	}

	@Override
	public void setEmployeeList(ArrayList<Employee> employeeList) {
		ProjectDataSource.setEmployeeList(employeeList);
	}

	@Override
	public HashSet<Project> getProjectList() {
		return ProjectDataSource.getProjectList();
	}

	@Override
	public void setProjectList(HashSet<Project> projectList) {
		ProjectDataSource.setProjectList(projectList);
	}

	@Override
	public HashMap<Project, ArrayList<Employee>> getProjectWiseEmployeeList() {
		return ProjectDataSource.getProjectWiseEmployeeList();
	}
	@Override
	public void setProjectWiseEmployeeList(HashMap<Project, ArrayList<Employee>> projectWiseEmployeeList) {
		ProjectDataSource.setProjectWiseEmployeeList(projectWiseEmployeeList);
	}

}
