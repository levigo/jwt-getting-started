package org.jwt.tutorial.spring.boot.server;

import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.levigo.jadice.web.server.spring.autoconfig.EnableJWTSpringBootApplication;

@SpringBootApplication
@EnableJWTSpringBootApplication("org.jwt.Application")
public class Application {

}
