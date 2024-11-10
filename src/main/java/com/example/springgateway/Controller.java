package com.example.springgateway;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/public")
public class Controller {

  @GetMapping()
  public String findByBlogId() {
    return "TEST OK public";
  }
}
