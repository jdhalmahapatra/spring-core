package com.springcore.referenceinject;

public class User {
	private int id;
	private String name;
	private Department department;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Department getDepartment() {
		return department;
	}
	public void setDepartment(Department department) {
		this.department = department;
	}
	
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", department=" + department + "]";
	}
	
	
}
