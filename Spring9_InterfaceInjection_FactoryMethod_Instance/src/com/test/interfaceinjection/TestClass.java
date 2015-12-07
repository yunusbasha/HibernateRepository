package com.test.interfaceinjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestClass {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
		
		// First getting the model object
		StudentInterfaceModel model = (StudentInterfaceModel) context.getBean("student_interface_modelID");
		
		// Declare the interface 
		StudentInterface inter = model.getSI();
		
		inter.insertStudent();
		inter.deleteStudent();
		
		//In real time we use only interface injections
		// we cannot configure interface into configuration file only class is used.....
	}

}
