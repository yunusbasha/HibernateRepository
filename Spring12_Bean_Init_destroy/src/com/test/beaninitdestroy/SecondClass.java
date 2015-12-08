package com.test.beaninitdestroy;

public class SecondClass {

	// In servlet we cannot change the life cycle methods but using spring we can change.
	
	public void myInitmethod()
	{
		System.out.println("Spring init method.....");
	}
	
	public void myDestroymethod()
	{
		System.out.println("Spring destroy method....");
	}
}
