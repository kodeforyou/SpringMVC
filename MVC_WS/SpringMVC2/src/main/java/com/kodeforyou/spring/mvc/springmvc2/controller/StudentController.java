package com.kodeforyou.spring.mvc.springmvc2.controller;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

import com.kodeforyou.spring.mvc.springmvc2.bean.Student;
import com.kodeforyou.spring.mvc.springmvc2.service.StudentService;

public class StudentController extends AbstractController {
	private String successView;
	private String errorView;
	private StudentService studentService;

	@Override
	protected ModelAndView handleRequestInternal(HttpServletRequest request, HttpServletResponse response)
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
