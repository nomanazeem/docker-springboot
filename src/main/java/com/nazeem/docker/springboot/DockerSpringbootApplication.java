package com.nazeem.docker.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@SpringBootApplication
@RestController("/")
public class DockerSpringbootApplication {

	@GetMapping("/")
	public String hello(){
		Date dt = new Date();
		return "Hello greeting..."+dt.getTime();

	}
	public static void main(String[] args) {
		SpringApplication.run(DockerSpringbootApplication.class, args);
	}

}
