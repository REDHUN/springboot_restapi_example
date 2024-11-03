package com.redhun.spring_boot_rest.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LoggingAspect {

    private static final Logger LOGGER = LoggerFactory.getLogger(LoggingAspect.class);

    // return type, class-name.method-name(args)
    @Before("execution(* com.redhun.spring_boot_rest.service.JobService.getJob(..)) || execution(* com.redhun.spring_boot_rest.service.JobService.updateJob(..)) ")
    public void logMethodCall(JoinPoint jp) {

        LOGGER.info("Method called " + jp.getSignature().getName());
    }

    @After("execution(* com.redhun.spring_boot_rest.service.JobService.getJob(..)) || execution(* com.redhun.spring_boot_rest.service.JobService.updateJob(..)) ")
    public void logMethodExecuted(JoinPoint jp) {

        LOGGER.info("Method Executed " + jp.getSignature().getName());
    }

    @AfterThrowing("execution(* com.redhun.spring_boot_rest.service.JobService.getJob(..)) || execution(* com.redhun.spring_boot_rest.service.JobService.updateJob(..)) ")
    public void logMethodCrash(JoinPoint jp) {

        LOGGER.info("Method has some issue" + jp.getSignature().getName());
    }
    @AfterReturning("execution(* com.redhun.spring_boot_rest.service.JobService.getJob(..)) || execution(* com.redhun.spring_boot_rest.service.JobService.updateJob(..)) ")
    public void logMethodExecuteSuccess(JoinPoint jp) {

        LOGGER.info("Method has execute successfully" + jp.getSignature().getName());
    }

}
