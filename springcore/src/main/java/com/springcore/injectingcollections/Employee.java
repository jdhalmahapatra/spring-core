package com.springcore.injectingcollections;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Employee {
	private String employeeName;
	private List<String> mobileNumbers;
	private Set<String> emaildIds;
	private Map<String, String> projects;
	
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public List<String> getMobileNumbers() {
		return mobileNumbers;
	}
	public void setMobileNumbers(List<String> mobileNumbers) {
		this.mobileNumbers = mobileNumbers;
	}
	public Set<String> getEmaildIds() {
		return emaildIds;
	}
	public void setEmaildIds(Set<String> emaildIds) {
		this.emaildIds = emaildIds;
	}
	public Map<String, String> getProjects() {
		return projects;
	}
	public void setProjects(Map<String, String> projects) {
		this.projects = projects;
	}
	
	
	
	public Employee(String employeeName, List<String> mobileNumbers, Set<String> emaildIds,
			Map<String, String> projects) {
		super();
		this.employeeName = employeeName;
		this.mobileNumbers = mobileNumbers;
		this.emaildIds = emaildIds;
		this.projects = projects;
	}
	
	
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String toString() {
		return "Employee [employeeName=" + employeeName + ", mobileNumbers=" + mobileNumbers + ", emaildIds="
				+ emaildIds + ", projects=" + projects + "]";
	}
	
	
	
}
