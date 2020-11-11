package com.kodeforyou.spring.mvc.springmvc2.service;
import com.kodeforyou.spring.mvc.springmvc2.bean.Student;
import com.kodeforyou.spring.mvc.springmvc2.dao.StudentDAO;

public class StudentService {
	public StudentDAO studentDAO;
	public void setStudentDAO(StudentDAO studentDAO) {
		this.studentDAO = studentDAO;
	}
	
	public Student getStudent(int rollNum) {
		return studentDAO.getStudent(rollNum);
	}

	

}
