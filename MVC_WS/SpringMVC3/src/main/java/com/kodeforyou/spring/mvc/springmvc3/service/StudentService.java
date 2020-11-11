package com.kodeforyou.spring.mvc.springmvc3.service;
import org.springframework.beans.factory.annotation.Autowired;

import com.kodeforyou.spring.mvc.springmvc3.bean.Student;
import com.kodeforyou.spring.mvc.springmvc3.dao.StudentDAO;

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
