package com.abc.map;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class TestMapBean {

	public static void main(String[] args) {

		Resource resource = new ClassPathResource("mapbean.xml");
		BeanFactory factory = new XmlBeanFactory(resource);

		MapBean MP = (MapBean) factory.getBean("mapbeanID");

		System.out.println(MP);

		Iterator itr = MP.getMap().entrySet().iterator(); // get the map and
															// then get entrySet

		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println("***************************************");
		// Another iterator model INDUSTRY STANDARD
		Iterator<Map.Entry> itr2 = MP.getMap().entrySet().iterator();
		// Map interface with inner interface (entry)

		while (itr2.hasNext()) {
			System.out.println(itr2.next());
		}
	}
}
