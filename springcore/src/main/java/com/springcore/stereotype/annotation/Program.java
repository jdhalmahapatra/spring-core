package com.springcore.stereotype.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = 
				new ClassPathXmlApplicationContext("com/springcore/stereotype/annotation/stereotypeconfig.xml");
		
		Student std = context.getBean("student", Student.class);
		System.out.println(std);
		System.out.println(std.getCityAdresses());
		((ClassPathXmlApplicationContext)context).close();
	}

}
