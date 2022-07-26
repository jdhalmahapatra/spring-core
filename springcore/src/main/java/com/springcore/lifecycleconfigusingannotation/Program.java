package com.springcore.lifecycleconfigusingannotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/lifecycleconfigusingannotation/config.xml");
		MotorCycle m1 = (MotorCycle)context.getBean("m1");
		System.out.println(m1);
		
		((ClassPathXmlApplicationContext)context).close();
	}

}
