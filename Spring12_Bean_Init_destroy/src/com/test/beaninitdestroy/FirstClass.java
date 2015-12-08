package com.test.beaninitdestroy;

import javax.security.auth.DestroyFailedException;
import javax.security.auth.Destroyable;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class FirstClass implements InitializingBean, DisposableBean{

	// Bean Lifecycle is equal to servlet life cycle [1. init() 2. service() 3. destroy()]
	
	// In Bean Lifecycle 1. initialization 2. destroy
	
	// Server or web container
	
	// First Request from IE --> URL pattern S1 -->  init() and then service() executed 
	// Second request from Chrome --> URL pattern S1 --> only service() executed 

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("init() method is executed from Bean Class");
		
	}
	
	@Override
	public void destroy() throws Exception {
		System.out.println("destroy() method is executed from Bean Class");
		
	}
}
