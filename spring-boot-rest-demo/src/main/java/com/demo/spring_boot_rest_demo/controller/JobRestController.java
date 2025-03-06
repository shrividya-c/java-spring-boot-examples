package com.demo.spring_boot_rest_demo.controller;

import com.demo.spring_boot_rest_demo.model.JobPost;
import com.demo.spring_boot_rest_demo.service.JobPostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin(origins = "http://localhost:3000/")
public class JobRestController {
    @Autowired
    private JobPostService jobPostService;

    @GetMapping("/jobPosts")
//    @ResponseBody
    public List<JobPost> getAllJobPosts(){
        return jobPostService.getAllJobs();
    }

    @GetMapping("/jobPost/{jobPostId}")
    public Optional<JobPost> getJobPost(@PathVariable("jobPostId") int jobPostId){
        return jobPostService.getJobPostById(jobPostId);
    }

    @PostMapping("/jobPost")
    public Optional<JobPost> addJobPost(@RequestBody JobPost jobPost){
        jobPostService.addJobPost(jobPost);
        return jobPostService.getJobPostById(jobPost.getPostId());
    }

    @DeleteMapping("jobPost/{jobPostId}")
    public String deleteJobPost(@PathVariable int jobPostId){
        jobPostService.deleteJobPostById(jobPostId);
        return "Job Post " + jobPostId + " deleted!";
    }

    @PutMapping("/jobPost")
    public Optional<JobPost> updateJobPost(@RequestBody JobPost jobPost){
        jobPostService.updateJobPost(jobPost);
        return jobPostService.getJobPostById(jobPost.getPostId());
    }

    @GetMapping("loadData")
    public String loadData(){
        jobPostService.loadData();
        return "loaded data successfully!";
    }

    @GetMapping("jobPosts/search/{keyword}")
    public List<JobPost> searchByKeyword(@PathVariable("keyword") String keyWord){
        return jobPostService.searchByKeyword(keyWord);
    }
}
