package com.courseMS.main.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.courseMS.main.service.TutorService;

@RestController
public class TutorController {

	@Autowired
	TutorService tut_service;
	
	@RequestMapping("/api/tutor/show/{nam}")
	String showTutorname(@PathVariable int nam) {
		
		return tut_service.getViewTutorInfo(nam);
		
	}
	
	
	
}
