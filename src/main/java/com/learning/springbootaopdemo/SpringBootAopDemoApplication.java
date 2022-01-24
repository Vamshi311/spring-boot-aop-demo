package com.learning.springbootaopdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

//@EnableAspectJAutoProxy
@SpringBootApplication
public class SpringBootAopDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootAopDemoApplication.class, args);
	}

}
