package com.springcore.autowire;

public class Address {
	private String city;
	private String street;
	
	public void setCity(String city) {
		this.city = city;
	}
	public String getCity() {
		return city;
	}
	
	public void setStreet(String street) {
		this.street = street;
	}
	
	public String getStreet() {
		return street;
	}
	
	@Override
	public String toString() {
		return "The city of the employ is : " + city + "\n" + 
	            "Belongs to street : " + street + "\n";
	}
	
}
