package com.springcore.lifecycleconfigusingannotation;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class MotorCycle {
	private String maker;
	private String name;
	
	public String getMaker() {
		return maker;
	}
	public void setMaker(String maker) {
		this.maker = maker;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public MotorCycle() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String toString() {
		return "MotorCycle [maker=" + maker + ", name=" + name + "]";
	}
	
	@PostConstruct
	public void init() {
		System.out.println("Init method called");
	}
	
	@PreDestroy
	public void destroy() {
		System.out.println("Destroy method called");
	}
	
}
