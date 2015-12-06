package com.test.autowiring;

public class SecondClass {

	private FirstClass first;

	public SecondClass(FirstClass first) {				
		// we are assigning the FirstClass value in constructor
		System.out.println("This is second class constructor....");
		this.first = first;
	}

	public FirstClass getFirst() {
		return first;
	}

	public void setFirst(FirstClass first) {
		// we are assinging the FirstClass value in setter injection.....
		System.out.println("This is second class setter injection....");
		this.first = first;
	}
}
