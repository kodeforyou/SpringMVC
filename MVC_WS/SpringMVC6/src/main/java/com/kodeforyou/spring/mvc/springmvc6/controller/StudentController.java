package com.kodeforyou.spring.mvc.springmvc6.controller;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.kodeforyou.spring.mvc.springmvc6.bean.Student;
import com.kodeforyou.spring.mvc.springmvc6.service.StudentService;
@Controller
public class StudentController{
	@Value("success")
	private String successView;
	@Value("error")
	private String errorView;
	@Autowired
	private StudentService studentService;

	@RequestMapping(path="/findStudent.t",method=RequestMethod.POST)
	protected ModelAndView someMethodName(HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		System.out.println("StudentController handleRequestInternal executed");
		ModelAndView modelAndView = null;
		String studentMdelString = "";
		String outputPage = errorView;
		int rollNum = Integer.parseInt(request.getParameter("rollNum"));
		Student studentModel = studentService.getStudent(rollNum);
		if (studentModel != null) {
			studentMdelString = studentModel.toString();
			outputPage = successView;
			modelAndView = new ModelAndView(outputPage, "studentDetails", studentMdelString);

		} else
			modelAndView = new ModelAndView(outputPage, "errorDetails",
					"No Such Student details avilable with This System");

		return modelAndView;
	}

	public void setSuccessView(String successView) {
		this.successView = successView;
	}

	public void setErrorView(String errorView) {
		this.errorView = errorView;
	}

	public void setStudentService(StudentService studentService) {
		this.studentService = studentService;
	}
}
