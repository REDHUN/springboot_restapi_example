package com.redhun.spring_boot_rest.repo;


import com.redhun.spring_boot_rest.model.JobPost;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
@Repository
public class JobRepo {


    List<JobPost> jobs=  new ArrayList<>(Arrays.asList(

            new JobPost(1,"java dev", "good exp",2,List.of("Redhun","kichun")),
            new JobPost(2,"java dev", "good exp",2,List.of("heeee","j"))
    ));

            public List<JobPost> getAllJobs(){

        return  jobs;
            }

            public  void  addJob(JobPost post){
                jobs.add(post);
                System.out.println(jobs);
            }


    public  JobPost getJob(int postId) {

                for (JobPost job : jobs){
                    if(job.getPostId()==postId){
                        return job;
                    }
                }
                return  null;


    }
}
