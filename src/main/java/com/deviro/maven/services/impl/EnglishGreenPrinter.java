package com.deviro.maven.services.impl;

import org.springframework.stereotype.Component;

import com.deviro.maven.services.GreenPrinter;

@Component
public class EnglishGreenPrinter implements GreenPrinter {

  @Override
  public String print() {
    return "green";
  }
}
