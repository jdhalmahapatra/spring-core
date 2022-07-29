package com.springcore.spel;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/spel/spelconfig.xml");
		
		User u1 = context.getBean("user", User.class);
		
		System.out.println(u1);
		
		((ClassPathXmlApplicationContext)context).close();
	}

}
