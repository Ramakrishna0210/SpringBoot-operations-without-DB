package com.courseMS.main.service;

import org.springframework.stereotype.Component;

import com.courseMS.main.model.Tutor;

@Component
public class TutorService {

	Tutor tutor=new Tutor();
	
	
	public String getViewTutorInfo(int nam) {
		
		
		
		int index=getIndex(nam);
		
		return "<<<<< Tutor Info >>>>"+"\n"
		        +"Names :"+tutor.tutor_names.get(index)+"\n"
		        +"Ids :"+tutor.tutor_ids.get(index)+"\n"
		        +"Passwords :"+tutor.tutor_passwords.get(index);
		
	}
	
	int getIndex(int nam) {
		
		return  tutor.tutor_ids.indexOf(nam);
	}
	
	public String getCreateTutorInfo() {
		
		return null;
		
	}
	
	public String getRenameTutor() {
		
		return null;
		
	}
	
	public String getCreateTutor() {
		
		return null;
		
	}
}
