package com.mohit.bean;

import java.util.ArrayList;
import java.util.HashMap;

public class EmployeeWiseProject {
	private HashMap<Project,ArrayList<Employee>> hmap=new HashMap<>();
	
	public EmployeeWiseProject() {
		
	}
	
	public HashMap<Project, ArrayList<Employee>> getHmap() {
		return hmap;
	}

	public void setHmap(HashMap<Project, ArrayList<Employee>> hmap) {
		this.hmap = hmap;
	}
	
}
