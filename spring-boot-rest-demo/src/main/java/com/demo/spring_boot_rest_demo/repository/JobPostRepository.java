package com.demo.spring_boot_rest_demo.repository;

import com.demo.spring_boot_rest_demo.model.JobPost;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Repository
public interface JobPostRepository extends JpaRepository<JobPost, Integer> {
    List<JobPost> findByPostProfileContainingOrPostDescriptionContaining(String postProfile, String postDescription);


//    public List<JobPost> jobPostList = new ArrayList<>(Arrays.asList(
//            new JobPost(1, "Java Developer","Must have good experience in core Java and advanced Java", 2,
//                    List.of("Core Java", "J2EE", "Spring Boot", "Hibernate")),
//            new JobPost(2, "Frontend Developer", "Experience in building responsive web applications using React", 3,
//                    List.of("HTML", "CSS", "JavaScript", "React")),
//            new JobPost(3, "Data Scientist", "Strong background in machine learning and data analysis", 4,
//                    List.of("Python", "Machine Learning", "Data Analysis")),
//            new JobPost(4, "Network Engineer", "Design and implement computer networks for efficient data communication", 5,
//                    List.of("Networking", "Cisco", "Routing", "Switching")),
//            new JobPost(5, "Mobile App Developer", "Experience in mobile app development for iOS and Android", 3,
//                    List.of("iOS Development", "Android Development", "Mobile App"))
//    ));
//
//    public List<JobPost> getAllJobs(){
//        return jobPostList;
//    }
//
//    public void addJobPost(JobPost jobPost){
//        jobPostList.add(jobPost);
//        System.out.println("Added: " + jobPost);
//    }
//
//    public JobPost getJobPostById(int jobPostId) {
//        for(JobPost job : jobPostList){
//            if(job.getPostId() == jobPostId){
//                return  job;
//            }
//        }
//        return null;
//    }
//
//    public void deleteJobPostById(int jobPostId) {
//        JobPost jobPostToBeDeleted = getJobPostById(jobPostId);
//        jobPostList.remove(jobPostToBeDeleted);
//    }
//
//    public void updateJobPost(JobPost jobPost) {
//        int jobPostId_to_be_updated = jobPost.getPostId();
//        JobPost jobPost_update = getJobPostById(jobPostId_to_be_updated);
//        jobPost_update.setPostDescription(jobPost.getPostDescription());
//        jobPost_update.setPostProfile(jobPost.getPostProfile());
//        jobPost_update.setPostTechStack(jobPost.getPostTechStack());
//        jobPost_update.setRequiredExperience(jobPost.getRequiredExperience());
//    }
}
