FROM openjdk:17-jdk-slim

WORKDIR /opt/app

ARG JAR_FILE=target/jenkins.demo-0.0.1-SNAPSHOT.jar
COPY ${JAR_FILE} app.jar

# java -jar /opt/app/app.jar
ENTRYPOINT ["java","-jar","app.jar"]
