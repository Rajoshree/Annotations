package com.annotations;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;

@Configuration
public class myConfig {
	
	@Bean("stu 1")
	@Lazy
	public student getStudent()
	{
		System.out.println("Getting student object");
		return new student("stu 1");
		
	}
	
	@Bean("stu 2")
	@Lazy
	public student getStudent2()
	{
		System.out.println("Getting 2ndstudent object");
		return new student("stu2");
		
	}
}
