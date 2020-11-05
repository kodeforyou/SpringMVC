package com.kodeforyou.spring.mvc.excelviewresolverapp.controller;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

import com.kodeforyou.spring.mvc.excelviewresolverapp.bean.Student;
import com.kodeforyou.spring.mvc.excelviewresolverapp.service.StudentService;

public class StudentController extends AbstractController {
    private StudentService studentService;
    
    
	public void setStudentService(StudentService studentService) {
		this.studentService = studentService;
	}

	@Override
	protected ModelAndView handleRequestInternal(HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		System.out.println("student controller executed");
		ModelAndView modelAndView = null;
		List<Student> students = studentService.getAllStudents();
		modelAndView = new ModelAndView("studentDetailsExcelView", "students", students);
		return modelAndView;
	}
	

}