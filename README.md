# DemoMavenMultiArtifact
Experimenting a Maven project with multiple artifacts

## Introduction

This project is meant as a playground to experiment with Maven and how to setup a project with multiple artifacts.

## Project structure

The project is structured as follows:

```
|| - pom.xml (parent from: org.sonarsource.parent:parent)
||
|| --- private
||     || - pom.xml (parent from: com.sonarsource.parent:parent)
||     ||
||     || - private-plugin
||          || - pom.xml
||          || - src/main/java/com/sonarsource/example
||               || - PrivatePlugin.java
||
|| --- public-plugin
||     || - pom.xml
||     || - src/main/java/org/sonarsource/example
||          || - PublicPlugin.java
```

### Building the project

```
mvn clean install -Dlicense.skip=true
```

