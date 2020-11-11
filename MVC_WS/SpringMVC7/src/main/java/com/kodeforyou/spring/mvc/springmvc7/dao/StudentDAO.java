package com.kodeforyou.spring.mvc.springmvc7.dao;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.kodeforyou.spring.mvc.springmvc7.bean.Student;
@Repository
public class StudentDAO {
	// in memory repository / db
	private Map<Integer, Student> studentReppo = new HashMap<Integer, Student>();

	public StudentDAO() {
		Student s = null;
		
		s = new Student(5, "satya", 6000.00);
		studentReppo.put(s.getRollNum(), s);
		
		s = new Student(1, "raju", 7000.00);
		studentReppo.put(s.getRollNum(), s);
		
		s = new Student(2, "rani", 5000.00);
		studentReppo.put(s.getRollNum(), s);
		
		s = new Student(3, "soni", 6000.00);
		studentReppo.put(s.getRollNum(), s);
		
		s = new Student(4, "kranthi", 9000.00);
		studentReppo.put(s.getRollNum(), s);
	}

	public Student getStudent(int rollNum) {
		return studentReppo.get(rollNum);
	}

	public void createStudent(Student s) {
		studentReppo.put(s.getRollNum(), s);
	}

}