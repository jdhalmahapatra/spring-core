package com.springcore.spel;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("user")
public class User {
	
	@Value("Jyotiraditya")
	private String userName;
	
	@Value("#{22+11}")
	private int age;
	
	@Value("#{ T(java.lang.Math).sqrt(4) }")
	private double z;
	
	@Value("#{ T(java.lang.Math).PI}")
	private double pi;
	
	@Value("#{ 8>3 }")
	private boolean isActive;
	
	
	public boolean getIsActive() {
		return isActive;
	}

	public void setIsActive(boolean isActive) {
		this.isActive = isActive;
	}

	public double getPi() {
		return pi;
	}

	public void setPi(double pi) {
		this.pi = pi;
	}

	public double getZ() {
		return z;
	}
	
	public void setZ(double z) {
		this.z = z;
	}

	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "User [userName=" + userName + ", age=" + age + ", z=" + z + ", pi=" + pi + ", isActive=" + isActive
				+ "]";
	}

	

	
	
	

}
