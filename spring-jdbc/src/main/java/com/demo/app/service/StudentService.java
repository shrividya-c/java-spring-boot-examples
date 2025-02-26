package com.demo.app.service;

import com.demo.app.model.Student;
import com.demo.app.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {
    private Student student;

    private StudentRepository studentRepository;

    public StudentRepository getStudentRepository() {
        return studentRepository;
    }

    @Autowired
    public void setStudentRepository(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public void saveStudent(Student student){
        studentRepository.save(student);
    }

    public List<Student> findStudents(){
        return studentRepository.findAll();
    }
}
