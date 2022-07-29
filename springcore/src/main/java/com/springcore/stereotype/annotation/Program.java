package com.springcore.stereotype.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = 
				new ClassPathXmlApplicationContext("com/springcore/stereotype/annotation/stereotypeconfig.xml");
		
		Student std = context.getBean("student", Student.class);
		System.out.println(std);
		System.out.println(std.getCityAdresses());
		
		
		System.out.println(std.hashCode());  //by default Singleton bean scope
		
		Student std1 = context.getBean("student", Student.class);
		System.out.println(std1.hashCode()); //by default Singleton bean scope
		
		
		Teacher t1 = context.getBean("teacher", Teacher.class);
		System.out.println(t1.getTeacherName());
		
		System.out.println(t1.hashCode());
		
		Teacher t2 = context.getBean("teacher", Teacher.class);
		System.out.println(t2.hashCode());
		
		((ClassPathXmlApplicationContext)context).close();
	}

}
