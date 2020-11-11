package com.kodeforyou.spring.mvc.userdefinedmvc.servlet;
import org.springframework.context.ApplicationContext;
import org.springframework.web.servlet.mvc.AbstractController;

public class MyBeanNameUrlHandlerMapping {
  public AbstractController getControllerByBeanName(String beanName, ApplicationContext context) {
	  AbstractController controller = context.getBean(beanName,AbstractController.class);
	  return controller;
  }
}
