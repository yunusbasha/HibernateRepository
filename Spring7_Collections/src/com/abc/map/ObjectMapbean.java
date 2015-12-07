package com.abc.map;

public class ObjectMapbean {

	private String name, city;

	public ObjectMapbean() {
		super();
	}

	@Override
	public String toString() {
		return "ObjectMapbean [name=" + name + ", city=" + city + "]";
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
