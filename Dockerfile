FROM maven:3.9.9-eclipse-temurin-21-alpine AS build

WORKDIR /build
COPY pom.xml .
COPY src ./src

RUN mvn clean package

FROM eclipse-temurin:21-jre-alpine

WORKDIR /app

COPY --from=build /build/target/java-devops-app-1.0.0.jar app.jar

ENTRYPOINT ["java", "-jar", "app.jar"]
