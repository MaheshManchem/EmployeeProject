package com.employee.sample.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan(basePackages={"com.employee.sample"})
@EntityScan("com.employee.sample.entity")
@EnableJpaRepositories("com.employee.sample.repository")
public class EmployeeSampleMain {

	public static void main(String[] args){
		SpringApplication.run(EmployeeSampleMain.class,args);
	}
}
