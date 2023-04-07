package com.springcore.autowire;

public class Company {
	private String name;
	private String city;
	
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getCity() {
		return city;
	}
	
	@Override
	public String toString() {
		return "The name of the company of employ : " + name + "\n" + 
	           "Location : " + city + "\n";
	}
}
