package com.example.gcpcloudbuilddocker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class GcpcloudbuilddockerApplication {

	public static void main(String[] args) {
		SpringApplication.run(GcpcloudbuilddockerApplication.class, args);
	}
	@GetMapping("/")
	public String getMyName() {
		
		return "Hello From GKE second app";
	}
	@GetMapping("/home")
	public String getMyName() {
		
		return "Hello Home GKE second app";
	}
	@GetMapping("/test")
	public String getMyName() {
		
		return "Hello Test GKE second app";
	}

}
