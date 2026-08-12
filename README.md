# Java Jenkins CI/CD Demo

This is a simple Java Maven application created for a Jenkins CI/CD assignment.

## Pipeline Stages

1. Build - compiles and packages the Java application.
2. Test - runs JUnit unit tests.
3. Deploy - simulates deployment.

## Run locally

```bash
mvn clean package
mvn test
java -cp target/classes com.example.App
```

## Jenkins

Create a Pipeline job and use the `Jenkinsfile` from this project.
Configure Jenkins tools with the names `Maven` and `JDK17`, or adjust the Jenkinsfile to match your Jenkins installation.
