package com.test.servlet;

import java.io.IOException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ServletClass extends HttpServlet{

	/*From web.xml it execute all methods of the class*/
	public ServletClass()
	{
		   System.out.println("Constructor creates an object......");
	}
	 
	public void init()
	{
		System.out.println("init() method is called......");
	}
	
	public void service(HttpServletRequest request, HttpServletResponse response) throws IOException
	{
		System.out.println("service() method is called.....");
	}
	
	
}