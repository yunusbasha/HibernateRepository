package com.test.factory;

public class classA {

	// factory -- it delivers a product of same type.
	
	static private classA a = new classA();			// creating one object.
	
	public static classA getInstance()					// factory method
	{
		return a;			// returning the object name
	}
	
	// static and non static members 
	
	// we can call static members in 3 ways 
	// 1. through object 
	//2. through class
	//3. directly we can call (if members are available in same class)
	
	// non static members (instance members) are called only through object only...
}
