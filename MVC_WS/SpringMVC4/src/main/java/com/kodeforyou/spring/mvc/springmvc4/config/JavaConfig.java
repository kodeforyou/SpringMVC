package com.kodeforyou.spring.mvc.springmvc4.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.handler.BeanNameUrlHandlerMapping;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

import com.kodeforyou.spring.mvc.springmvc4.controller.AddController;
import com.kodeforyou.spring.mvc.springmvc4.controller.StudentController;
import com.kodeforyou.spring.mvc.springmvc4.controller.TestController;
import com.kodeforyou.spring.mvc.springmvc4.dao.StudentDAO;
import com.kodeforyou.spring.mvc.springmvc4.service.StudentService;

@Configuration
//@EnableWebMvc  not required now find out when required
public class JavaConfig {
	@Bean
	public StudentDAO studentDAO() {
		return new StudentDAO();
	}
	@Bean 
	public StudentService studentService() {
		return new StudentService();
	}
	@Bean("/findStudent.t")
	public StudentController studentController() {
		return new StudentController();
	}
	@Bean("/findTest.t")
	public TestController testController() {
		return new TestController();
	}
	@Bean("/findSum.t")
	public AddController addController() {
		return new AddController();
	}
	@Bean
	public BeanNameUrlHandlerMapping beanNameUrlHandlerMapping() {
		return new BeanNameUrlHandlerMapping();
	}
	@Bean
	public InternalResourceViewResolver internalResourceViewResolver() {
		InternalResourceViewResolver internalResourceViewResolver = new InternalResourceViewResolver();
		internalResourceViewResolver.setPrefix("/WEB-INF/pages/");
		internalResourceViewResolver.setSuffix(".jsp");
		return internalResourceViewResolver;
	}
}
