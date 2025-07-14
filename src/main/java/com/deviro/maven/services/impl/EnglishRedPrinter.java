package com.deviro.maven.services.impl;

import org.springframework.stereotype.Component;

import com.deviro.maven.services.RedPrinter;

@Component
public class EnglishRedPrinter implements RedPrinter {

  @Override
  public String print() {
    return "red";
  }
}
