package com.test.autowiring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestClass {

	public static void main(String[] args)
	{
		ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
		
		SecondClass second = (SecondClass) context.getBean("secondclass_ID");
		second.getFirst().printMethod(); 			
		// second class object -- get second class property -- get first class method 
	}
}
