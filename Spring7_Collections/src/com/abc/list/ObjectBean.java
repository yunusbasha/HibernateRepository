package com.abc.list;

public class ObjectBean {

	private String name, city;

	public ObjectBean() {
		
		// default constructor
	}

	public ObjectBean(String name, String city) {
		super();
		this.name = name;
		this.city = city;
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

	@Override
	public String toString() {
		return "ObjectBean [name=" + name + ", city=" + city + "]";
	}
}
