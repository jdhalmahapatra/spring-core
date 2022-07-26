package com.springcore.autowire.xml;

public class Address {
	private String Street;
	private String city;
	private String State;
	
	
	public String getStreet() {
		return Street;
	}
	public void setStreet(String street) {
		Street = street;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return State;
	}
	public void setState(String state) {
		State = state;
	}
	
	@Override
	public String toString() {
		return "Address [Street=" + Street + ", city=" + city + ", State=" + State + "]";
	}
	
	
}
