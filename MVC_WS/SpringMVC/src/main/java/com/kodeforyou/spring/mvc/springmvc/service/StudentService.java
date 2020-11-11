package com.kodeforyou.spring.mvc.springmvc.service;
import com.kodeforyou.spring.mvc.springmvc.bean.Student;
import com.kodeforyou.spring.mvc.springmvc.dao.StudentDAO;

public class StudentService {
	public StudentDAO studentDAO;
	public void setStudentDAO(StudentDAO studentDAO) {
		this.studentDAO = studentDAO;
	}
	
	public Student getStudent(int rollNum) {
		return studentDAO.getStudent(rollNum);
	}

	

}
