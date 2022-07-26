package com.springcore.injectingcollections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/injectingcollections/collectionconfig.xml");
			Employee emp = (Employee) context.getBean("employee");
			
			System.out.println(emp.getEmployeeName());
			System.out.println(emp.getMobileNumbers());
			System.out.println(emp.getEmaildIds());
			System.out.println(emp.getProjects());
			((ClassPathXmlApplicationContext)context).close();
	}

}
