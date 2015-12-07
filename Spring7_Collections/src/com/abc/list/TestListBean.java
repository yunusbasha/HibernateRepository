package com.abc.list;

import java.util.List;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class TestListBean {

	public static void main(String[] args) {

		Resource resource = new ClassPathResource("bean.xml");
		
		BeanFactory factory = new XmlBeanFactory(resource);
		
		Object obj = factory.getBean("listbeanID");
		
		ListBean LB = (ListBean) obj;
		List list = LB.getList();
		System.out.println(list);   	
		
		// without toString() it will display output as ObjectBean@65456  [classname@hashcode]
	}

}
