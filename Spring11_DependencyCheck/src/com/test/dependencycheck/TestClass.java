package com.test.dependencycheck;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestClass {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
		
		SecondClass secondclass = (SecondClass) context.getBean("secondclass_ID");
		
		System.out.println("The First class property name is "+secondclass.getFirstclass().getName());
	}

}
