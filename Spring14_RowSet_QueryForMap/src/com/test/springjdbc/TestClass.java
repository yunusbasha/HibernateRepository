package com.test.springjdbc;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.config.PropertyPlaceholderConfigurer;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class TestClass {

	public static void main(String[] args) {
		
		Resource resource = new ClassPathResource("bean.xml");
		
		XmlBeanFactory factory = new XmlBeanFactory(resource);
		
		Resource propresource = new ClassPathResource("database.properties");
		// Location of properties file
		
		//Broker in between source and destination
		PropertyPlaceholderConfigurer propconfig = new PropertyPlaceholderConfigurer();
		
		//Destination
		propconfig.setLocation(propresource);
		
		// source
		propconfig.postProcessBeanFactory(factory);
		
		
		StudentService studentservice = (StudentService) factory.getBean("studentservice_ID");
		
		studentservice.listData();			// display raw data
	}
}
