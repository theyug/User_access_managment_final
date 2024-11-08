package com.yug.User_access_managment_final;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories("com.yug.User_access_managment_final.Repo")
@EntityScan("com.yug.User_access_managment_final.model")
public class UserAccessManagmentFinalApplication {
	public static void main(String[] args) {
		SpringApplication.run(UserAccessManagmentFinalApplication.class, args);
	}
}
