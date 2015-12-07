package com.abc.first;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class MainClass {

	public static void main(String[] args) {
		Resource resource = new ClassPathResource("bean.xml");			//Resource (Interface)
																	//ClassPathResource(implemented path of Resource interface)
																    //ClassPathResource must contain only inside the project
		
		// Resource --> ClassPathResource and FileSystemResource
		  
		BeanFactory factory = new XmlBeanFactory(resource);
				
		Object obj = factory.getBean("studentID");
		
		Student stu = (Student) obj;
		
		stu.displayAddress();

	}

}
