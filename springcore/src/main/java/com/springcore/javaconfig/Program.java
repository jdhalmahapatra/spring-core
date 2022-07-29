package com.springcore.javaconfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class Program {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			ApplicationContext context = 
					new AnnotationConfigApplicationContext(JavaConfig.class);
			Student std = context.getBean("student", Student.class);
			
			System.out.println(std);
			std.study();
			
			((AnnotationConfigApplicationContext)context).close();
				
	}
}
