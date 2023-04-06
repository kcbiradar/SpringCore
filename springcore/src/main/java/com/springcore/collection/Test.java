package com.springcore.collection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	private static ApplicationContext context;
	public static void main(String[] args) {
		context = new ClassPathXmlApplicationContext("com/springcore/collection/cconfig.xml");
		 CollectionType con = (CollectionType)context.getBean("emp");
		 System.out.println(con.getName());
		 System.out.println(con.getPhones());
		 System.out.println(con.getAddress());
		 System.out.println(con.getCourses());
	}

}
