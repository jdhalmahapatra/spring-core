package com.springcore.lifecycleconfigusinginterface;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Car implements InitializingBean, DisposableBean{
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
	public Car() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Car [maker=" + maker + ", name=" + name + "]";
	}
	
	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub
		//This is nothing but init() method, when using Interface technique
		System.out.println("Car class Initialised");
	}
	public void destroy() throws Exception {
		// TODO Auto-generated method stub
		//This is nothing but destroy() method, when using Interface technique
		System.out.println("Car class Instance getting destroyed");
	}
	
	
	
	
	
	
}
