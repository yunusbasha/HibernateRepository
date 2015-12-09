package com.test.springjdbc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestClass {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
		
		StudentProcedure studentprocedure = (StudentProcedure) context.getBean("studentprocedure_ID");
		
		studentprocedure.executeMyProcedure(102);
		
		
	}

}
