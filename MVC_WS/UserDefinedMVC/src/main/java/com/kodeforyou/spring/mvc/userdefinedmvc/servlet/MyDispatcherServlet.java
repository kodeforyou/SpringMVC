package com.kodeforyou.spring.mvc.userdefinedmvc.servlet;
import java.io.IOException;
import java.util.Map;
import java.util.Set;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

public class MyDispatcherServlet extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
		doPost(req,res);
	}
	public void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException {
		// http://localhost:8080/WebApp1/findTest.t
		// http://localhost:8080/WebApp1/findSum.t?num1=5&num2=6
		// http://localhost:8080/WebApp1/findStudent.t?rollNum=5
		
		//taking the bean name
		System.out.println(req.getRequestURI());
		String beanNameurl = req.getRequestURI().substring(15);
		System.out.println(beanNameurl);
		
		//taking the servlet name and creating spring container 
		//the spring container creates beans configured servletname-servlet.xml file
		String servletName = getServletName();
		System.out.println("servletName:" + servletName);
		ApplicationContext context = new ClassPathXmlApplicationContext(servletName + "-servlet.xml");

		// take Handler mapping bean from container
		MyBeanNameUrlHandlerMapping handlerMapping = context.getBean("com.kodeforyou.spring.mvc.userdefinedmvc.servlet.MyBeanNameUrlHandlerMapping", MyBeanNameUrlHandlerMapping.class);

		//Step3:
		//ask handler mapping to provide controller by Bean or by other means (here we are getting by bean name)
		AbstractController controler = (AbstractController) handlerMapping.getControllerByBeanName(beanNameurl, context);
	
		//  beanNameurl may give any value
		// "/findSum.t"																										
		// "/findTest.t" 
		// "/findStudent.t";
		try {
			// our dispatcher servlet will call controller's handleRequest() method
			//where handleRequest() method  will  internally call handleRequestInternal() method of controller
			//Step4:
			ModelAndView mav = controler.handleRequest(req, res);// will call handleRequestInternal

			
			//take viewResolver from the container
			MyInternalResourceViewResolver viewResolver = context.getBean("com.kodeforyou.spring.mvc.userdefinedmvc.servlet.MyInternalResourceViewResolver", MyInternalResourceViewResolver.class);
			
			//Step5:
			// now view Resolver will give particular view by taking mav obj 
			String viewjsp = viewResolver.getRedirectableView(mav);
			
			//take the data from mav obj and set it in request scope as attributes
			Map<String,Object> map = mav.getModel();
			
			Set<String> keys = map.keySet();
			for(String key:keys) {
				Object value = map.get(key);
				req.setAttribute(key, value);//set as request scope attribute
			}
			
			//Step6:
			//invoke the view or redirect to the view
			req.getRequestDispatcher(viewjsp).forward(req, res);
		} catch (Exception e) {
			e.printStackTrace();
		}

		res.getWriter().print("<br>Hi this is servlet");
	}
}
