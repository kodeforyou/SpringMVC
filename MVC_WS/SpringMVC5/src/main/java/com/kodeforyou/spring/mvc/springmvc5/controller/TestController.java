package com.kodeforyou.spring.mvc.springmvc5.controller;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
@Controller
public class TestController{
	@RequestMapping(path="/findTest.t",method=RequestMethod.POST)
	protected ModelAndView method(HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		System.out.println("****TestController handleRequestInternal executed****");
		ModelAndView modelAndView = new ModelAndView("test", "msg", "This is a test model and view");// "test" is view, model means data that is 3rd parameter
		return modelAndView;
	}

}
