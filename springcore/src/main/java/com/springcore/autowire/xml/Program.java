package com.springcore.autowire.xml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/autowire/xml/autowireconfig.xml");
		
		//Employee emp = (Employee) context.getBean("emp");
		Employee emp1 = context.getBean("emp", Employee.class);
		//Employee emp2 = context.getBean("emp1", Employee.class);
		System.out.println(emp1);
		//System.out.println(emp2);
		
		((ClassPathXmlApplicationContext)context).close();
		
	}

}
