package com.springcore.lifecycleconfigusinginterface;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/lifecycleconfigusinginterface/lcinterfaceconfig.xml");
		Car c1 = (Car) context.getBean("c1");
		System.out.println(c1);
		((ClassPathXmlApplicationContext)context).close();
	}

}
