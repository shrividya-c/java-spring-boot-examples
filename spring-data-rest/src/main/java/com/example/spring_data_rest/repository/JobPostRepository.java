package com.example.spring_data_rest.repository;

import com.example.spring_data_rest.model.JobPost;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JobPostRepository extends JpaRepository<JobPost, Integer> {
}
