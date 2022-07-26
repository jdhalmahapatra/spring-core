package com.springcore.autowire.xml;

public class HealthDetails {
	private String bloodGroup;
	//private boolean isPreExistingIllNessAvailable;
	
	public String getBloodGroup() {
		return bloodGroup;
	}
	public void setBloodGroup(String bloodGroup) {
		this.bloodGroup = bloodGroup;
	}
	
//	public boolean isPreExistingIllNessAvailable() {
//		return isPreExistingIllNessAvailable;
//	}
//	public void setPreExistingIllNessAvailable(boolean isPreExistingIllNessAvailable) {
//		this.isPreExistingIllNessAvailable = isPreExistingIllNessAvailable;
//	}
	
	@Override
	public String toString() {
		return "HealthDetails [bloodGroup=" + bloodGroup + "]";
	}
	
	
}
