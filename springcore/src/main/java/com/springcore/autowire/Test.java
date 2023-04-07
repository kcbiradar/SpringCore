package com.springcore.autowire;


import org.springframework.context.ApplicationContext;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	
	private static ApplicationContext context;
	
	public static void main(String[] args) {
		context = new ClassPathXmlApplicationContext("com/springcore/autowire/auconfig.xml");
		//Address e = context.getBean("address1" , Address.class);
		Emp e = context.getBean("emp1" , Emp.class);
		System.out.println(e);
	}

}
