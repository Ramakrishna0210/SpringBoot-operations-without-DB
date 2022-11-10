package com.courseMS.main.service;

import org.springframework.stereotype.Component;

import com.courseMS.main.model.Student;


@Component
public class StudentService {

	
  Student student=new Student();
	
	
	public String getViewStudentInfo(int sid) {
		
		int index=getIndex(sid);
		return ">>> Student Info <<<"+"\n"
                +"SId:"+sid+"\n"
                +"Name"+student.student_names.get(index)+"\n"
                +"Qualification :"+student.student_qualification.get(index)+"\n"
                +"Email:"+student.student_email_ids.get(index)+"\n"
                +"Phone number:"+student.student_contact_nos.get(index)+"\n"
                +"Address:"+student.student_address.get(index);
	                   	}
	
	
	
	int getIndex(int sid)
                      {
		
		return student.student_ids.indexOf(sid);
                      }
	
	public String getDeleteStudentInfo(int sid) {
		
		int index=student.student_ids.indexOf(sid);
		// sid will be removed 
		student.student_ids.remove(index);
		
		return "Slected  SID"+sid+"Was Removed!!!";
		
	}
	
	public String getModifyStudentInfo() {
		
		return null;
		
	}
	
	public String getCreateStudent() {
		
		return null;
		
	}
	
	public String getViewAllStudent() {
		String allStudentInfo="";
		
		
		
		return null;
		
	}
}
