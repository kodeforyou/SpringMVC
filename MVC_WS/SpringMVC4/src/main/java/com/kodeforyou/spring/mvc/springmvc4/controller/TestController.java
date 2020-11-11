package com.kodeforyou.spring.mvc.springmvc4.controller;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

public class TestController  extends AbstractController {

	@Override
	protected ModelAndView handleRequestInternal(HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		System.out.println("****TestController handleRequestInternal executed****");
		ModelAndView modelAndView = new ModelAndView("test", "msg", "This is a test model and view");// "test" is view, model means data that is 3rd parameter
		return modelAndView;
	}

}
