package com.example;


public class Greeter {

  /**
  * Constructor by default.
  */
  public Greeter() {

  }

  public final String greet(final String someone) {
    return String.format("Hello babacar, %s!", someone);
  }
}
