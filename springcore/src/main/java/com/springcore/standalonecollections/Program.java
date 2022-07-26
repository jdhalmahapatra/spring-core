package com.springcore.standalonecollections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/standalonecollections/standalonecollectionsconfig.xml");
		Person p1 = context.getBean("p1", Person.class);
		System.out.println(p1);
		System.out.println(p1.getFriends().getClass().getName());
		((ClassPathXmlApplicationContext)context).close();
	}

}
