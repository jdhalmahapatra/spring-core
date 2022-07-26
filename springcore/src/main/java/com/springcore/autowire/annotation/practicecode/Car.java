package com.springcore.autowire.annotation.practicecode;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Car {
	private int noOfWheels;
	private String steeringType;
	
	@Autowired
	@Qualifier("maker2")
	private Maker maker;
	
	public int getNoOfWheels() {
		return noOfWheels;
	}
	public void setNoOfWheels(int noOfWheels) {
		this.noOfWheels = noOfWheels;
	}
	public String getSteeringType() {
		return steeringType;
	}
	public void setSteeringType(String steeringType) {
		this.steeringType = steeringType;
	}
	public Maker getMaker() {
		return maker;
	}
	public void setMaker(Maker maker) {
		this.maker = maker;
	}
	
	
	public Car() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Car(int noOfWheels, String steeringType, Maker maker) {
		super();
		this.noOfWheels = noOfWheels;
		this.steeringType = steeringType;
		this.maker = maker;
	}
	
	@Override
	public String toString() {
		return "Car [noOfWheels=" + noOfWheels + ", steeringType=" + steeringType + ", maker=" + maker + "]";
	}
	
	
	
	
}
