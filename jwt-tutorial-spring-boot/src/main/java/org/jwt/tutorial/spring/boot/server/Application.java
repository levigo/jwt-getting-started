package org.jwt.tutorial.spring.boot.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.levigo.jadice.web.server.spring.autoconfig.EnableJWTSpringBootApplication;

@SpringBootApplication
@EnableJWTSpringBootApplication("org.jwt.Application")
public class Application {
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
}
