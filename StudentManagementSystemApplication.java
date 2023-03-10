package net.java.sms;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import net.java.sms.repository.StudentRepository;

@SpringBootApplication
public class StudentManagementSystemApplication implements CommandLineRunner
{

	public static void main(String[] args) {
		SpringApplication.run(StudentManagementSystemApplication.class, args);
	}
	
	@Autowired
	private StudentRepository studentRepository;
	@Override
	public void run(String... args) throw Exception
	{
		Student student1=new Student("ragul","s","raguls@gmail.com");
		studentRepository.save(student1);
		
		Student student2=new Student("prem","a","prema@gmail.com");
		studentRepository.save(student2);
		
		Student student3=new Student("tony","d","tonyd@gmail.com");
		studentRepository.save(student3);
	}

}
