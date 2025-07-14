package com.deviro.maven.config;

import com.deviro.maven.services.BluePrinter;
import com.deviro.maven.services.ColourPrinter;
import com.deviro.maven.services.GreenPrinter;
import com.deviro.maven.services.RedPrinter;
import com.deviro.maven.services.impl.ColourPrinterImpl;
import com.deviro.maven.services.impl.EnglishBluePrinter;
import com.deviro.maven.services.impl.EnglishGreenPrinter;
import com.deviro.maven.services.impl.EnglishRedPrinter;
import com.deviro.maven.services.impl.SpanishBluePrinter;
import com.deviro.maven.services.impl.SpanishGreenPrinter;
import com.deviro.maven.services.impl.SpanishRedPrinter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class PrinterConfig {

  @Bean
  public BluePrinter bluePrinter() {
    return new SpanishBluePrinter();
  }

  @Bean
  public RedPrinter redPrinter() {
    return new SpanishRedPrinter();
  }

  @Bean
  public GreenPrinter greenPrinter() {
    return new SpanishGreenPrinter();
  }

  @Bean
  public ColourPrinter colourPrinter(
      RedPrinter redPrinter, BluePrinter bluePrinter, GreenPrinter greenPrinter) {
    return new ColourPrinterImpl(redPrinter, bluePrinter, greenPrinter);
  }
}
