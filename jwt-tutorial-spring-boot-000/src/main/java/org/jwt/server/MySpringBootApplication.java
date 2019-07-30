package org.jwt.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

import com.levigo.jadice.web.server.spring.autoconfig.EnableJWTSpringBootApplication;

@SpringBootApplication
@EnableJWTSpringBootApplication("org.jwt.Application")
@ServletComponentScan(value={"org.jwt"})
public class MySpringBootApplication extends SpringBootServletInitializer {
  
	public static void main(String[] args) {
		SpringApplication.run(MySpringBootApplication.class, args);
	}
}
