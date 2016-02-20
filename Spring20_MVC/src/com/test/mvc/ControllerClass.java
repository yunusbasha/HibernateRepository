package com.test.mvc;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;
public class ControllerClass implements Controller
{

	//  Controller Interface contains only one method "handleRequest"
	@Override
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
		System.out.println("Controller class has started....");
		return new ModelAndView("success.jsp");			// displaying the success.jsp
	}
}