package org.sonarsource.example;

public class PublicPlugin implements org.sonar.api.Plugin{

  @Override
  public void define(Context context) {
    System.out.println("Public Plugin!");

    // todo add to the context only the extensions from public!
  }
}
