package com.springcore.referenceinject;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
			ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/referenceinject/referenceconfig.xml");
			
			User user = (User) context.getBean("user");
			System.out.println(user.getId());
			System.out.println(user.getName());
			System.out.println(user.getDepartment());
			
			((ClassPathXmlApplicationContext) context).close();
	}

}
