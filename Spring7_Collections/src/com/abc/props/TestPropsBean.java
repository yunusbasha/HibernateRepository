package com.abc.props;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class TestPropsBean {

	public static void main(String[] args) {

		Resource resource = new ClassPathResource("propsbean.xml");
		BeanFactory factory = new XmlBeanFactory(resource);
		
		PropsBean PB = (PropsBean) factory.getBean("propsbeanID");
		System.out.println(PB);
	}
}
