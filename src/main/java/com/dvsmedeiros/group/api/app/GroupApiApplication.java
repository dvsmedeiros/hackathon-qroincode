package com.dvsmedeiros.group.api.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Import;

import com.dvsmedeiros.bce.core.BceCoreApplication;

@Import(BceCoreApplication.class)
@ComponentScan("com.dvsmedeiros")
@EnableAutoConfiguration
@SpringBootApplication
public class GroupApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(GroupApiApplication.class, args);
	}
}
