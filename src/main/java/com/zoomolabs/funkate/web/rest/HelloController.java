package com.zoomolabs.funkate.web.rest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by ajeetkumar on 7/9/18.
 */
@RestController("/")
public class HelloController {

  @RequestMapping(value = "", method = RequestMethod.GET)
  public String index() {
    return "Greetings from Spring Boot New!";
  }

  @RequestMapping(value = "/health", method = RequestMethod.GET)
  public String healthCheck() {
    return "I'm OK 200";
  }

}
