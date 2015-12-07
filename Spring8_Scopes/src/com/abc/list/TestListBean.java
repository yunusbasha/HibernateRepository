package com.abc.list;

import java.util.List;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class TestListBean {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
		
		// Creating first object....
		ObjectBean obj = (ObjectBean) context.getBean("objectbeanID");
		
		// Creating second object.....
		ObjectBean obj2 = (ObjectBean) context.getBean("objectbeanID");
		}

}
