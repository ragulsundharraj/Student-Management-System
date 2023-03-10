package net.java.sms.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import net.java.sms.entity.Student;
import net.java.sms.repository.StudentRepository;
import net.java.sms.service.StudentService;

@Service
public class StudentServiceImpl implements StudentService
{
	
	private StudentRepository studentRepository;
	
	
	public StudentServiceImpl(StudentRepository studentRepository) {
		super();
		this.studentRepository = studentRepository;
	}


	@Override
	public List<Student> getAllStudents()
	{
		return studentRepository.findAll();
	}

}
