package com.courseMS.main.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.courseMS.main.service.StudentService;

@RestController
public class StudentController {
	
	@Autowired
	StudentService stu_service;
	
	@RequestMapping("/api/student/show/{sid}")
	String showStudentInfo(@PathVariable  int sid) {
		return stu_service.getViewStudentInfo(sid);
	}
	
	@RequestMapping("/api/student/delete/{sid}")
	String deleteSid(@PathVariable int sid) {
		
		return stu_service.getDeleteStudentInfo(sid);
	}

}
