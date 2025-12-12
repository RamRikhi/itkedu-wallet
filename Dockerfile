# Dockerfile for itkedu-wallet Spring Boot application
FROM gradle:8-jdk17 AS builder
WORKDIR /home/gradle/project
COPY gradle gradle
COPY gradlew .
COPY settings.gradle* build.gradle* ./
COPY src ./src
RUN ./gradlew bootJar -x test --no-daemon

FROM eclipse-temurin:17-jdk-jammy
WORKDIR /app
COPY --from=builder /home/gradle/project/build/libs/*.jar app.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","/app/app.jar"]

