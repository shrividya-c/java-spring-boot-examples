package com.demo.spring_boot_rest_demo.service;

import com.demo.spring_boot_rest_demo.model.JobPost;
import com.demo.spring_boot_rest_demo.repository.JobPostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.ArrayList;

@Service
public class JobPostService {
    @Autowired
    private JobPostRepository jobPostRepository;

    public List<JobPost> getAllJobs(){
//        return jobPostRepository.getAllJobs();
        return jobPostRepository.findAll();
    }

    public  void addJobPost(JobPost jobPost){
//        jobPostRepository.addJobPost(jobPost);
        jobPostRepository.save(jobPost);
    }

    public Optional<JobPost> getJobPostById(int jobPostId) {
//        return jobPostRepository.getJobPostById(jobPostId);
        return Optional.of(jobPostRepository.findById(jobPostId).orElse(new JobPost()));
    }

    public void deleteJobPostById(int jobPostId) {
//        jobPostRepository.deleteJobPostById(jobPostId);
        jobPostRepository.deleteById(jobPostId);
    }

    public void updateJobPost(JobPost jobPost) {
        jobPostRepository.save(jobPost);
    }

    public void loadData() {
        List<JobPost> jobPostList = new ArrayList<>(Arrays.asList(
            new JobPost(1, "Java Developer","Must have good experience in core Java and advanced Java", 2,
                    List.of("Core Java", "J2EE", "Spring Boot", "Hibernate")),
            new JobPost(2, "Frontend Developer", "Experience in building responsive web applications using React", 3,
                    List.of("HTML", "CSS", "JavaScript", "React")),
            new JobPost(3, "Data Scientist", "Strong background in machine learning and data analysis", 4,
                    List.of("Python", "Machine Learning", "Data Analysis")),
            new JobPost(4, "Network Engineer", "Design and implement computer networks for efficient data communication", 5,
                    List.of("Networking", "Cisco", "Routing", "Switching")),
            new JobPost(5, "Mobile App Developer", "Experience in mobile app development for iOS and Android", 3,
                    List.of("iOS Development", "Android Development", "Mobile App"))
        ));
        jobPostRepository.saveAll(jobPostList);
    }

    public List<JobPost> searchByKeyword(String keyWord) {
        return jobPostRepository.findByPostProfileContainingOrPostDescriptionContaining(keyWord,keyWord);
    }
}
