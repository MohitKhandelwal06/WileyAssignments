package com.mohit.bean;

import java.util.Objects;

public class Project {

	private int pid;
	private String pName;
	public Project(int pid, String pName) {
		super();
		this.pid = pid;
		this.pName = pName;
	}
	public Project() {
		
	}
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getpName() {
		return pName;
	}
	public void setpName(String pName) {
		this.pName = pName;
	}
	@Override
	public String toString() {
		return "Project [pid=" + pid + ", pName=" + pName + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(pName, pid);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Project other = (Project) obj;
		return Objects.equals(pName, other.pName) && pid == other.pid;
	}
	
}
