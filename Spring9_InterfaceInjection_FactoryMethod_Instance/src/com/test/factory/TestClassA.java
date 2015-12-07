package com.test.factory;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestClassA {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("factorybean.xml");
		
		classA a = (classA) context.getBean("classA_ID");
		
		System.out.println(a);
		
		classA a2 = (classA) context.getBean("classA_ID");
		System.out.println(a2);
		
	}

}
