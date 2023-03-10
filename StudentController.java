package net.java.sms.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import net.java.sms.service.StudentService;

@Controller
public class StudentController 
{
	private StudentService studentService;

	public StudentController(StudentService studentService) {
		super();
		this.studentService = studentService;
	}
	
	//Handler method to handle list students and return mode and view
	@GetMapping("/students")
	public String listStudents(Model model)
	{
		model.addAttribute("students",studentService.getAllStudents());
		return "students";
		
	}
	

}
