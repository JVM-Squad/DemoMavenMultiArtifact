/*
 * Copyright (C) ${project.inceptionYear}-2024 SonarSource SA
 * All rights reserved
 * mailto:info AT sonarsource DOT com
 */
package com.sonarsource.example;

public class PrivatePlugin implements org.sonar.api.Plugin {

  @Override
  public void define(Context context) {
    System.out.println("Private Plugin!");

    // todo add to the context all the extensions from private and public!
  }
}
