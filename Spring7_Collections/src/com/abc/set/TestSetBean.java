package com.abc.set;

import java.util.Iterator;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class TestSetBean {

	public static void main(String[] args) {

		Resource resource = new ClassPathResource("setbean.xml");
		BeanFactory factory = new XmlBeanFactory(resource);
		
		SetBean SB = (SetBean) factory.getBean("setbeanID");
		
		System.out.println(SB);
		
		Iterator itr = SB.getSet().iterator();				// Iterator getting the values and iterate
		
		while(itr.hasNext())			
		{
			System.out.println(itr.next());
		}

	}

}
