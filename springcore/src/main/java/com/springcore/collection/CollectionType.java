package com.springcore.collection;

import java.util.*;

public class CollectionType {
	private String name;
	private List<String> phones;
	private Set<String> addresses;
	private Map<String , String> courses;
	
	public void setPhones(List<String> phones) {
		this.phones = phones;
	}
	public List<String> getPhones() {
		return phones;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public void setAddresses(Set<String> addresses) {
		this.addresses = addresses;
	}
	
	public Set<String> getAddress() {
		return addresses;
	}
	
	public void setCourses(Map<String , String> courses) {
		this.courses = courses;
	}
	public Map<String , String> getCourses() {
		return courses;
	}
	
	public CollectionType() {
		super();
	}
	public CollectionType(String name , List<String> phones , Set<String> addresses , Map<String , String> courses) {
		this.name = name;
		this.addresses = addresses;
		this.phones = phones;
		this.courses = courses;
	}
	@Override
	public String toString() {
		return "Name of the employ : " + name + "\n";
	}
}
