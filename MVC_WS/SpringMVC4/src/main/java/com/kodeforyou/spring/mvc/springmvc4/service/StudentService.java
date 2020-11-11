package com.kodeforyou.spring.mvc.springmvc4.service;
import org.springframework.beans.factory.annotation.Autowired;

import com.kodeforyou.spring.mvc.springmvc4.bean.Student;
import com.kodeforyou.spring.mvc.springmvc4.dao.StudentDAO;

public class StudentService {
	@Autowired
	public StudentDAO studentDAO;
	public void setStudentDAO(StudentDAO studentDAO) {
		this.studentDAO = studentDAO;
	}
	
	public Student getStudent(int rollNum) {
		return studentDAO.getStudent(rollNum);
	}

	

}
