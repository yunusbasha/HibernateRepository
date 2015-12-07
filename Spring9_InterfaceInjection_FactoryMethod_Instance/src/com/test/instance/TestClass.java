package com.test.instance;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestClass {

	public static void main(String[] args) {

		ApplicationContext context  = new ClassPathXmlApplicationContext("instancebean.xml");
		
		class1 class1object = (class1) context.getBean("class1_ID");
		
		class1object.print();
	}

}
