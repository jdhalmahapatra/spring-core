package com.springcore.lifecycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/lifecycle/lifecycleconfig.xml");
			Samosa s1 =(Samosa)context.getBean("s1");
			System.out.println(s1);
			((ClassPathXmlApplicationContext)context).close();	
	}

}
