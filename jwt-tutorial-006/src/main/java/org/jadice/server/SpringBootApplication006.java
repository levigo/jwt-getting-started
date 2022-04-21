package org.jadice.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.levigo.jadice.web.server.spring.autoconfig.EnableJWTSpringBootApplication;


/**
 * The {@link EnableJWTSpringBootApplication} value points to the Application.gwt.xml file
 */
@SpringBootApplication
@EnableJWTSpringBootApplication("org.jadice.Application")
public class SpringBootApplication006 {
  public static void main(String[] args) {
    SpringApplication.run(SpringBootApplication006.class);
  }
}
