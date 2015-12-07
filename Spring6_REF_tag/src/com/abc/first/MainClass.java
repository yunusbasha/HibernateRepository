package com.abc.first;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class MainClass {

	public static void main(String[] args) {
		
		// default config file in spring = applicationContext.xml
		// default config file in hibernate = hibernate.cfg.xml
		// default config file in struts = struts-config.xml
		Resource resource = new ClassPathResource("bean.xml");			
		BeanFactory factory = new XmlBeanFactory(resource);
				
		Object obj = factory.getBean("studentID");
		
		Student stu = (Student) obj;
		
		stu.displayAddress();

	}

}
