package com.kodeforyou.spring.mvc.userdefinedmvc.service;
import com.kodeforyou.spring.mvc.userdefinedmvc.bean.Student;
import com.kodeforyou.spring.mvc.userdefinedmvc.dao.StudentDAO;

public class StudentService {
	public StudentDAO studentDAO;
	public void setStudentDAO(StudentDAO studentDAO) {
		this.studentDAO = studentDAO;
	}
	
	public Student getStudent(int rollNum) {
		return studentDAO.getStudent(rollNum);
	}

	

}
