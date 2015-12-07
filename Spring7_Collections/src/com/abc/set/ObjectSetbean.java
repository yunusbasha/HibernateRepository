package com.abc.set;

public class ObjectSetbean {

	private String name, city;

	public ObjectSetbean() {
		super();
	}

	@Override
	public String toString() {
		return "ObjectSetbean [name=" + name + ", city=" + city + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}
	
	
}
