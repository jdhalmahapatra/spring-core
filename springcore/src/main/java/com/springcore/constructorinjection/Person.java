package com.springcore.constructorinjection;

import java.util.List;
import java.util.Set;

public class Person {
	
	//Primitive Data Type
	private int id;
	private String name;
	
	//Collection Type
	private List<String> emailIds;
	private Set<Long> phoneNumbers;
	
	//Reference Type
	private Certificate cert;
	 
	public Person(int id, String name, List<String> emailIds, Set<Long> phoneNumbers, Certificate cert) {
		this.id = id;
		this.name = name;
		this.emailIds = emailIds;
		this.phoneNumbers = phoneNumbers;
		this.cert = cert;
	}

	@Override
	public String toString() {
		return this.id + " : " + this.name + " : " + this.emailIds + " : " + 
			this.phoneNumbers + " : " + "{ " +this.cert.getCertificateId() + " : " +this.cert.getCertificateName() + " }";
	}
	
	
}
