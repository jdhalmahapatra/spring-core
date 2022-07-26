package com.springcore.autowire.annotation;

import org.springframework.beans.factory.annotation.Autowired;

public class Employee {
	private String name;
	private int age;
	
	@Autowired
	private Address address;
	
	@Autowired
	private HealthDetails healthDetails;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		System.out.println("Setting Address");
		this.address = address;
	}
	
	public HealthDetails getHealthDetails() {
		return healthDetails;
	}
	
	//@Autowired
	public void setHealthDetails(HealthDetails healthDetails) {
		System.out.println("Setting HealthDetails");
		this.healthDetails = healthDetails;
	}
	
	public Employee() {
		super();
		System.out.println("Inside default constructor");
		// TODO Auto-generated constructor stub
	}
	
	
	//@Autowired
	public Employee(String name, int age, Address address, HealthDetails healthDetails) {
		super();
		this.name = name;
		this.age = age;
		this.address = address;
		this.healthDetails = healthDetails;
	}
	
	@Override
	public String toString() {
		return "Employee [name=" + name + ", age=" + age + ", address=" + address + ", healthDetails=" + healthDetails
				+ "]";
	}
	
	
	
	
	
	
}
