package com.bootcamp.demo_sb_restapi.config;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class SchedulerConfig {
  // @Scheduled(fixedDelay = 5000) // 5000 ms = 5 seconds
  public void sayHello() throws Exception{
    System.out.println(System.currentTimeMillis() + ": Scheduler start to say Hello");
    Thread.sleep(2000);
    System.out.println(System.currentTimeMillis() + ": Scheduler start to say Hello");

  }

  // @Scheduled(fixedRate = 5000) // 
  public void sayGoodBye() throws Exception{
    System.out.println(System.currentTimeMillis() + ": Scheduler start to say bye");
    Thread.sleep(2000); 
    System.out.println(System.currentTimeMillis() + ": Bye Bye Ended");

  }

  // @Scheduled(fixedRate = 5000) // 
  public void racing() throws Exception{
    System.out.println(System.currentTimeMillis() + ": Start");
    Thread.sleep(9000); // Single thread only, if the .sleep() > the value of annotation
    System.out.println(System.currentTimeMillis() + ": End");

  }
  // @Scheduled(cron = "0 59 20,18 * * MON - FRI")
  // public void runTask(){
  //   System.out.println("Cron job Test");
  // }

}
