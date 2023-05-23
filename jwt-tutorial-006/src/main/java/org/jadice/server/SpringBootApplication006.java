package org.jadice.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

import com.levigo.jadice.web.server.spring.autoconfig.EnableJWTSpringBootApplication;


/**
 * The {@link EnableJWTSpringBootApplication} value points to the Application.gwt.xml file
 */
@SpringBootApplication
@EnableJWTSpringBootApplication("org.jadice.Application")
public class SpringBootApplication006 extends SpringBootServletInitializer {
  public static void main(String[] args) {
    SpringApplication.run(SpringBootApplication006.class);
  }

  @Override
  protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
    return application.sources(applicationClass);
  }

  private static Class<SpringBootApplication006> applicationClass = SpringBootApplication006.class;

}
