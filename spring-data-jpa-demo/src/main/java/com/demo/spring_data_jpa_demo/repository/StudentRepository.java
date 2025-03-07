package com.demo.spring_data_jpa_demo.repository;

import com.demo.spring_data_jpa_demo.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer> {
    @Query("select s from Student s where s.name=?1")
    List<Student> findByName(String name);

    List<Student> findByMarks(int marks);

    List<Student> findByMarksGreaterThan(int marks);
}
