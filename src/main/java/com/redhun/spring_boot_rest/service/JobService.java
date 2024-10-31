package com.redhun.spring_boot_rest.service;


import com.redhun.spring_boot_rest.model.JobPost;
import com.redhun.spring_boot_rest.repo.JobRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class JobService {
@Autowired
JobRepo repo;
    public  void addJob(JobPost jobPost){
repo.addJob(jobPost);
    }

    public List<JobPost> getAllJobs(){

return  repo.getAllJobs();
    }

    public JobPost getJob( int postId) {
       return repo.getJob( postId);
    }
}