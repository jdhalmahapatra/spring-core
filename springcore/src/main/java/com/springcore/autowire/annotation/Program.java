package com.springcore.autowire.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/autowire/annotation/autowireconfig.xml");
		Employee emp1 = context.getBean("emp", Employee.class);
		System.out.println(emp1);
		((ClassPathXmlApplicationContext)context).close();
	}

}
