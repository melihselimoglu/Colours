package com.deviro.maven.services.impl;

import org.springframework.stereotype.Component;

import com.deviro.maven.services.BluePrinter;  

@Component
public class EnglishBluePrinter implements BluePrinter {

  @Override
  public String print() {
    return "blue";
  }
}
