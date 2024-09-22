package com.mydaytodo.blog_backend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"com.mydaytodo.blog_backend.repository", "com.mydaytodo.blog_backend.controller", "com.mydaytodo.blog_backend.service"})
public class BlogBackendApplication {

	public static void main(String[] args) {
		SpringApplication.run(BlogBackendApplication.class, args);
	}

}
