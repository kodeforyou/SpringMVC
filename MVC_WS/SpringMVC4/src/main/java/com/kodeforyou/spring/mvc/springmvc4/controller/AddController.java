package com.kodeforyou.spring.mvc.springmvc4.controller;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

public class AddController extends AbstractController  {

	@Override
	protected ModelAndView handleRequestInternal(HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		System.out.println("AddController handleRequestInternal executed");
		String num1  = request.getParameter("num1");
		String num2  = request.getParameter("num2");
		int a  =  Integer.parseInt(num1);// convert string to integer
		int b  =  Integer.parseInt(num2);// convert string to integer
		int result = a+b;
		String resultString = result+"";
		ModelAndView modelAndView = new ModelAndView("sum", "result", resultString);// here view is "sum" model is resultString 
		return modelAndView;
	}

}
