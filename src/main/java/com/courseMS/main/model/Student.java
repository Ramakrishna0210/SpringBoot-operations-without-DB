package com.courseMS.main.model;

import java.util.ArrayList;

public class Student {

	public ArrayList student_ids=new ArrayList();
	public	ArrayList student_names=new ArrayList();
	public	ArrayList student_qualification=new ArrayList();
	public	ArrayList student_contact_nos=new ArrayList();
	public	ArrayList student_email_ids=new ArrayList();
	public	ArrayList student_address=new ArrayList(); 
	
	public Student(){
		
		// Add Student IDs 
		student_ids.add(12310011);
		student_ids.add(12310012);
		student_ids.add(12310013);
		student_ids.add(12310014);
		
		//Add Student Names
		student_names.add("Pedro");
		student_names.add("Harry Potter");
		student_names.add("Lara Stone");
		student_names.add("Jersy Mic");
		
		//Add student qualification
		student_qualification.add("BSc");
		student_qualification.add("B-Tech");
		student_qualification.add("M-tech");
		student_qualification.add("MSc");
		
		//Add student contact number
		student_contact_nos.add(89078434);
		student_contact_nos.add(877548967);
		student_contact_nos.add(789479684);
		student_contact_nos.add(567687890);
		
		//Add student email
		student_email_ids.add("pedro@gmail.com");
		student_email_ids.add("harry@gmail.com");
		student_email_ids.add("lara@gmail.com");
		student_email_ids.add("jersy@gmail.com");
		
		// Add Student Address 
		student_address.add("H.No:103,fasttrack near ,western buildings,bangalore,pincode:50034");
		student_address.add("H.No:167,bommanalli near ,Hyderabad,pincode:50034");
		student_address.add("H.No:788,MG Road near ,western buildings,vizag,pincode:50067");
		student_address.add("H.No:908,white filed near ,western buildings,bangalore,pincode:50894");
		
		
		
		
	}
	
}
