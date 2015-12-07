package com.abc.parent;

public class Student {

	private Address address;				// class object type

	public void setAddress(Address address) {
		this.address = address;
	}
	
	public void displayAddress()
	{
		System.out.println("The City name from address class: "+address.getCity());
	}
	
	
}
