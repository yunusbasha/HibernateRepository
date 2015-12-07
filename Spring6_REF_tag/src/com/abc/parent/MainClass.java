package com.abc.parent;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class MainClass {

	public static void main(String[] args) {
		
		// we must declare both config files in main class....
		
		Resource resource = new ClassPathResource("Parentbean.xml");		
		BeanFactory factory = new XmlBeanFactory(resource);
		
		Resource resource2 = new ClassPathResource("Childbean.xml");
		BeanFactory factory2 = new XmlBeanFactory(resource2, factory);
		
		Object obj = factory2.getBean("studentID");
		
		Student stu = (Student) obj;
		
		stu.displayAddress();

	}

}
