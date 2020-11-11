package com.kodeforyou.spring.mvc.springmvc7.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kodeforyou.spring.mvc.springmvc7.bean.Student;
import com.kodeforyou.spring.mvc.springmvc7.dao.StudentDAO;
@Service
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
