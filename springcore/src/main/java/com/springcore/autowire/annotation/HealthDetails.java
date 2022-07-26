package com.springcore.autowire.annotation;

public class HealthDetails {
	private String bloodGroup;
	
	public String getBloodGroup() {
		return bloodGroup;
	}
	public void setBloodGroup(String bloodGroup) {
		this.bloodGroup = bloodGroup;
	}
	
	@Override
	public String toString() {
		return "HealthDetails [bloodGroup=" + bloodGroup + "]";
	}
	
	
}
