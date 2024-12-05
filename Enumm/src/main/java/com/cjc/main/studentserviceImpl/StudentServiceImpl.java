package com.cjc.main.studentserviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cjc.main.model.Student;
import com.cjc.main.repository.StudentRepository;
import com.cjc.main.serviceI.StudentService;
@Service
public class StudentServiceImpl implements StudentService{

	@Autowired
	StudentRepository sr;
	
	
	@Override
	public Student postStudentData(Student student) {
		
		return sr.save(student);
	}

}
