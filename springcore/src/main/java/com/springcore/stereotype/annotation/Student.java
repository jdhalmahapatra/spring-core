package com.springcore.stereotype.annotation;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Student {
	@Value("Jyotiraditya")
	private String studentName;
	@Value("Bhubaneswar")
	private String city;
	@Value("#{stdAdress}")
	private List<String> cityAdresses;
	
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	
	public List<String> getCityAdresses() {
		return cityAdresses;
	}
	public void setCityAdresses(List<String> cityAdresses) {
		this.cityAdresses = cityAdresses;
	}
	@Override
	public String toString() {
		return "Student [studentName=" + studentName + ", city=" + city + "]";
	}
	
	
	
}
