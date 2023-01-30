package com.githubaction.cloudscheduler.scheduler;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SchedulerApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(SchedulerApplication.class, args);
	}

	public void run(String... args) throws Exception {
		System.out.println("####################  GithubActionGkeApplication run Called 12##################");
		System.exit(0);
	}

	
}
