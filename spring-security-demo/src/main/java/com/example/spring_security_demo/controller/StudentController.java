package com.example.spring_security_demo.controller;

import com.example.spring_security_demo.model.Student;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.security.web.csrf.CsrfToken;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
public class StudentController {
    private List<Student> students = new ArrayList<>(Arrays.asList(new Student(1, "john doe", "java"),
            new Student(2, "smith joe", "python")));

    @GetMapping("/students")
    public List<Student> getAllStudents(){
        return students;
    }

    @PostMapping("/student")
    public Student addStudent(@RequestBody Student student){
        students.add(student);
        return student;
    }

    @GetMapping("/csrf")
    public CsrfToken getCsrfToken(HttpServletRequest request){
        return (CsrfToken) request.getAttribute("_csrf");
    }

}
