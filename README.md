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

### Experiment's Goal

The goal of this experiment is to have a project with two plugins, one public and one private, 
in two different modules that have different parents and share some dependencies.

#### The public-plugin
- Has `org.sonarsource.parent:parent` as parent pom
- Is in a public module
- Uses depdencies from other public modules
- The artifact should be published to a public repository

#### The private-plugin
- Has `com.sonarsource.parent:parent` as parent pom
- Is in a private module
- Uses dependencies from other private modules and public modules
- The artifact should be published to a private repository

### Building the project

```
mvn clean install -Dlicense.skip=true
```

