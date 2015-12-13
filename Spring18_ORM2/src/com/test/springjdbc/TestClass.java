package com.test.springjdbc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestClass {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
		
		StudentService service = (StudentService) context.getBean("studentservice_ID");
		
		service.loadStudent(102);
		
	}
}
