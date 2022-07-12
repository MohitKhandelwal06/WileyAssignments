package com.mohit.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

import com.mohit.bean.Employee;
import com.mohit.bean.Project;
import com.mohit.persistence.ProjectDaoImpl;

public class ProjectServiceImpl implements ProjectService {

	ProjectDaoImpl projectDaoImpl=new ProjectDaoImpl();
	@Override
	public boolean addEmployee(Employee employee) {
		ArrayList<Employee> employeeList=projectDaoImpl.getEmployeeList();
		employeeList.add(employee);
		projectDaoImpl.setEmployeeList(employeeList);
		return true;
	}

	@Override
	public boolean addProject(Project project) {
		HashSet<Project> projectList=projectDaoImpl.getProjectList();
		projectList.add(project);
		projectDaoImpl.setProjectList(projectList);
		HashMap<Project,ArrayList<Employee>>projectWiseEmployeeList=projectDaoImpl.getProjectWiseEmployeeList();
		projectWiseEmployeeList.put(project, new ArrayList<Employee>());
		projectDaoImpl.setProjectWiseEmployeeList(projectWiseEmployeeList);
		return true;
	}

	@Override
	public boolean allocateEmployee(int eId,int pId) {
		Employee employee=searchRecordById(eId);
		if(employee==null) {
			return false;
		}
		Project project=searchProjectById(pId);
		if(project==null) {
			return false;
		}
		HashMap<Project,ArrayList<Employee>> projectWiseLise=projectDaoImpl.getProjectWiseEmployeeList();
		for(Project pro : projectWiseLise.keySet()) {
			if(pro.equals(project)) {
				ArrayList<Employee>employeeList=projectWiseLise.get(pro);
				employeeList.add(employee);
				projectWiseLise.put(pro, employeeList);
			}
		}
		return true;
	}

	@Override
	public boolean deAllocateEmployee() {
		return false;
	}
	public ArrayList<Employee> getEmployeesOfAProject(Project project){
		HashMap<Project,ArrayList<Employee>> projectList=projectDaoImpl.getProjectWiseEmployeeList();
		for(Project pro:projectList.keySet()) {
			if(pro.equals(project)) {
				return projectList.get(pro);
			}
		}
		return null;
	}
	@Override
	public Employee searchRecordById(int id) {
		List<Employee> employees=projectDaoImpl.getEmployeeList();
		for(int index=0;index<employees.size()&&employees.get(index)!=null;index++) {
			if(employees.get(index).getEmpId()==id)
				return employees.get(index);
		}
		return null;
	}

	@Override
	public Project searchProjectById(int id) {
		HashSet<Project> projectList=projectDaoImpl.getProjectList();
		for(Project project:projectList) {
			if(project.getPid()==id) {
				return project;
			}
		}
		return null;
	}
	public ArrayList<Employee> getAllEmployees() {
		return projectDaoImpl.getEmployeeList();
	}

}
