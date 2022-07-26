package com.springcore.constructorinjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			 ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/constructorinjection/ciconfig.xml");
			 Person p = (Person) context.getBean("person");
			 System.out.println(p);
			 
			 Addition add = (Addition)context.getBean("addition");
			 add.doSum();
			 
			 ((ClassPathXmlApplicationContext)context).close();
	}

}
