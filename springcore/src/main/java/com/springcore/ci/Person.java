package com.springcore.ci;

public class Person {
	private String name;
	private int pId;
	
	public Person(String name , int pId) {
		this.name = name;
		this.pId = pId;
	}
	public Person() {
		super();
	}
	@Override
	public String toString() {
		return "Person name is : " + name + "\n"
				+ "Unique ID is : " + pId + "\n";
	}
}
