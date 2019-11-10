package com.javawiz;

import java.security.Principal;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.oauth2.client.EnableOAuth2Sso;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@EnableOAuth2Sso
public class SbOktaSsoApplication {
	
	@GetMapping("/")
	public String getDetails(Principal p) {
		return "Hi, "+p.getName()+", welcome oauth2 demo using Okta server.";
	}

	public static void main(String[] args) {
		SpringApplication.run(SbOktaSsoApplication.class, args);
	}
}
