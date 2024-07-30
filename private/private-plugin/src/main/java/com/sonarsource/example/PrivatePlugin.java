package com.sonarsource.example;

public class PrivatePlugin implements org.sonar.api.Plugin {

  @Override
  public void define(Context context) {
    System.out.println("Private Plugin!");

    // todo add to the context all the extensions from private and public!
  }
}
