package com.test.dependencycheck;

public class FirstClass {

	private String name;

	public FirstClass()
	{
		System.out.println("First Class constructor is called...");
	}
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
