package com.demo.spring_data_jpa_demo;

import com.demo.spring_data_jpa_demo.model.Student;
import com.demo.spring_data_jpa_demo.repository.StudentRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.List;
import java.util.Optional;

@SpringBootApplication
public class SpringDataJpaDemoApplication {

	public static void main(String[] args) {

		ApplicationContext context = SpringApplication.run(SpringDataJpaDemoApplication.class, args);

		StudentRepository studentRepository = context.getBean(StudentRepository.class);

		Student s1 = context.getBean(Student.class);
		s1.setRollNo(1);
		s1.setName("John");
		s1.setMarks(90);
		studentRepository.save(s1);

		Student s2 = context.getBean(Student.class);
		s2.setRollNo(2);
		s2.setName("Adam");
		s2.setMarks(85);
		studentRepository.save(s2);

		Student s3 = context.getBean(Student.class);
		s3.setRollNo(3);
		s3.setName("Mark");
		s3.setMarks(80);
		studentRepository.save(s3);

		List<Student> studentList = studentRepository.findAll();
		System.out.println("student list \n" + studentList);

		Optional<Student> student = studentRepository.findById(3);
		System.out.println("student with id: " + student.orElse(new Student()));

		System.out.println("student with name" + studentRepository.findByName("Adam"));

		System.out.println("student with marks" + studentRepository.findByMarks(80));

		System.out.println("student with marks greater than: "+studentRepository.findByMarksGreaterThan(86));
	}

}
