package org.jwt.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.levigo.jadice.web.server.spring.autoconfig.EnableJWTSpringBootApplication;


/**
 * The {@link EnableJWTSpringBootApplication} value points to the Application.gwt.xml file
 */
@SpringBootApplication
@EnableJWTSpringBootApplication("org.jwt.Application")
public class SpringBootApplication001 {
  public static void main(String[] args) {
    SpringApplication.run(SpringBootApplication001.class);
  }
}
