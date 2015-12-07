package com.test.dependencycheck;

public class SecondClass {

	private FirstClass firstclass;

	public SecondClass()
	{
		System.out.println("Second Class constructor is called...");
	}
	
	public FirstClass getFirstclass() {
		return firstclass;
	}

	public void setFirstclass(FirstClass firstclass) {
		this.firstclass = firstclass;
	}
}
