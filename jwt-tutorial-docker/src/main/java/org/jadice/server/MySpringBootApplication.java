package org.jadice.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

import com.levigo.jadice.web.server.spring.autoconfig.EnableJWTSpringBootApplication;

@SpringBootApplication
@EnableJWTSpringBootApplication("org.jadice.Application")
public class MySpringBootApplication extends SpringBootServletInitializer {
	public static void main(String[] args) {
		SpringApplication.run(MySpringBootApplication.class, args);
	}
	
	@Override
  protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
    return super.configure(builder);
  }
}
