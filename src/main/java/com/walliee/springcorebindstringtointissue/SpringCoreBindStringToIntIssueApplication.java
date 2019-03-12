package com.walliee.springcorebindstringtointissue;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties(ApplicationSettings.class)
public class SpringCoreBindStringToIntIssueApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCoreBindStringToIntIssueApplication.class, args);
	}

}
