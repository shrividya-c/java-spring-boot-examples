package com.demo.app;

import com.demo.app.model.Student;
import com.demo.app.service.StudentService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringJdbcDemoApplication {

	public static void main(String[] args) {

		ApplicationContext applicationContext = SpringApplication.run(SpringJdbcDemoApplication.class, args);
		Student student = applicationContext.getBean(Student.class);

		student.setRoll_no(004);
		student.setName("John Doe");
		student.setAge(24);

		StudentService studentService = applicationContext.getBean(StudentService.class);
		studentService.saveStudent(student);
		System.out.println(studentService.findStudents());
	}

}
