package com.mohit.service;

import com.mohit.bean.Employee;
import com.mohit.bean.Project;

public interface ProjectService {
	boolean addEmployee(Employee employee);
	boolean addProject(Project project);
	boolean allocateEmployee(int eId,int pId);
	boolean deAllocateEmployee();
	Employee searchRecordById(int id);
	Project searchProjectById(int id);
}
