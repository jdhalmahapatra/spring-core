package com.springcore.autowire.annotation.practicecode;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Program {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/autowire/annotation/practicecode/annotationconfig.xml");
		Car c1 = context.getBean("car", Car.class);
		
		System.out.println(c1);		
		((ClassPathXmlApplicationContext)context).close();
		
	}
}
