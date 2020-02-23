package com.sxf.service;

import com.sxf.pojo.Student;

public interface StudentService {
	
	Student getById(int id);
	
	Student addAge(Student stu,int n);

}
