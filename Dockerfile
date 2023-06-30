FROM gradle:jdk17-alpine as builder
USER root
WORKDIR /builder
ADD . /builder
RUN gradle build --stacktrace

FROM openjdk:17-jdk-alpine
WORKDIR /app
EXPOSE 8080
ADD ./build/libs/LoggingServer-0.0.1-SNAPSHOT.jar .
CMD ["java", "-jar", "LoggingServer-0.0.1-SNAPSHOT.jar"]