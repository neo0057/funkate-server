package com.zoomolabs.funkate;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
@Configuration
@ComponentScan
@EnableAutoConfiguration
public class FunkateApplication {

  public static void main(String[] args) {
    SpringApplication.run(FunkateApplication.class, args);
  }
}
