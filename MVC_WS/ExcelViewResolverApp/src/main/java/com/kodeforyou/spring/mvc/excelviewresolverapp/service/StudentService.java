package com.kodeforyou.spring.mvc.excelviewresolverapp.service;
import java.util.Arrays;
import java.util.List;

import com.kodeforyou.spring.mvc.excelviewresolverapp.bean.Student;

public class StudentService {
	
    private List<Student> students=Arrays.asList(
    		new Student(11,"satya",1000.0),
    		new Student(12,"bhanu",2000.0),
    		new Student(19,"shiva",1600.0),
    		new Student(31,"manu",1500.0),
    		new Student(21,"geeta",1300.0)
    		);
    public List<Student> getAllStudents(){
    	return students;
    }
}