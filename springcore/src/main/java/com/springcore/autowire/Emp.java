package com.springcore.autowire;

public class Emp {
	private Address address;
	private Company company;
	
	public void setAddress(Address address) {
		this.address = address;
	}
	public Address getAddrerss() {
		return address;
	}
	
	public void setCompany(Company company) {
		this.company = company;
	}
	
	public Company getCompany() {
		return company;
	}
	
	public Emp() {
		super();
	}
	public Emp(Address address , Company company) {
		super();
		this.address = address;
		this.company = company;
	}
	
	@Override
	public String toString() {
		return "Address of the employ is : \n" + address + "\n" + 
	           "Company details of the employ is : \n" + company + "\n";
	}
	
}
