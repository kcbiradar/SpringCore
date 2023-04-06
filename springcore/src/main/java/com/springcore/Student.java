package com.springcore;

public class Student {
	private int id;
	private String name;
	private String address;
	// getter and setter method
	public void setId(int id) {
		this.id = id;
	}
	public int getId() {
		return id;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getAddress() {
		return address;
	}
	public Student(int id , String name , String address) {
		super();
		this.id = id;
		this.address = address;
		this.name = name;
	}
	
	public Student() {
		super();
	}
	
	@Override
	public String toString() {
		return  "Student id is : " + id + "\n" + 
				"Student name is : " + name + "\n" + 
				"Student address is : " + address + "\n";
	}
}
