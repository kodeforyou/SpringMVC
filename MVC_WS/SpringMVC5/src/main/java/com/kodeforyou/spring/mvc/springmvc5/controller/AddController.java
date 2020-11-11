package com.kodeforyou.spring.mvc.springmvc5.controller;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

@Controller
public class AddController {

	@RequestMapping(path="/findSum.t",method=RequestMethod.POST)
	protected ModelAndView methodName(HttpServletRequest request, HttpServletResponse response)
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
