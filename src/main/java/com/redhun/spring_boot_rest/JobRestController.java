package com.redhun.spring_boot_rest;

import com.redhun.spring_boot_rest.model.JobPost;
import com.redhun.spring_boot_rest.service.JobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
public class JobRestController {

    @Autowired
    private JobService service;

    @GetMapping("jobPosts")
    public List<JobPost> getAllJobs(){

        return service.getAllJobs();

    }

    @GetMapping("jobPost/{postId}")
    public JobPost getJob(@PathVariable("postId") int postId){

        return service.getJob(postId);
    }
@PostMapping("jobPost")
    public JobPost addJob(@RequestBody JobPost jobPost){

        service.addJob(jobPost);
        return jobPost;

    }


}
