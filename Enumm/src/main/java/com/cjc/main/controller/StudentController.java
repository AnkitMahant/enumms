package com.cjc.main.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cjc.main.model.Student;
import com.cjc.main.serviceI.StudentService;

@RestController
@RequestMapping("/student")
public class StudentController 
{
	@Autowired
	StudentService si;
	
	@PostMapping("/post")
	public ResponseEntity<Student> postData(@RequestBody Student student)
	{
		
		
		Student data= si.postStudentData(student);
		return new ResponseEntity<Student>(data, HttpStatus.CREATED);
				
	}
	

}
