package com.test.beaninitdestroy;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestClass {

	public static void main(String[] args) throws Exception {
		ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
		
		FirstClass firstclass = (FirstClass) context.getBean("firstclass_ID");
		
		//firstclass.afterPropertiesSet();				// it internally declares the init() method
		firstclass.destroy();
		
		System.out.println("---------- ---------");
		SecondClass secondclass = (SecondClass) context.getBean("secondclass_ID");
		secondclass.myDestroymethod();
		}

}
