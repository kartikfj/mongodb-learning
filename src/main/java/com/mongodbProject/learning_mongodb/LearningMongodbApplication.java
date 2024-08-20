package com.mongodbProject.learning_mongodb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })

public class LearningMongodbApplication {

	public static void main(String[] args) {
		SpringApplication.run(LearningMongodbApplication.class, args);
	}

}
