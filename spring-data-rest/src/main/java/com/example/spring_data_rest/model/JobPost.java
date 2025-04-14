package com.example.spring_data_rest.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import org.springframework.stereotype.Component;

import java.util.List;



@Component
@Entity
public class JobPost {
    @Id
    private int postId;
    private String postProfile;
    private String postDescription;
    private int requiredExperience;
    private List<String> postTechStack;

    public JobPost() {
    }

    public JobPost(int postId) {
        this.postId = postId;
    }

    public JobPost(int postId, String postProfile, String postDescription, int requiredExperience, List<String> postTechStack) {
        this.postId = postId;
        this.postProfile = postProfile;
        this.postDescription = postDescription;
        this.requiredExperience = requiredExperience;
        this.postTechStack = postTechStack;
    }

    public int getPostId() {
        return postId;
    }

    public void setPostId(int postId) {
        this.postId = postId;
    }

    public String getPostProfile() {
        return postProfile;
    }

    public void setPostProfile(String postProfile) {
        this.postProfile = postProfile;
    }

    public String getPostDescription() {
        return postDescription;
    }

    public void setPostDescription(String postDescription) {
        this.postDescription = postDescription;
    }

    public int getRequiredExperience() {
        return requiredExperience;
    }

    public void setRequiredExperience(int requiredExperience) {
        this.requiredExperience = requiredExperience;
    }

    public List<String> getPostTechStack() {
        return postTechStack;
    }

    public void setPostTechStack(List<String> postTechStack) {
        this.postTechStack = postTechStack;
    }
}

