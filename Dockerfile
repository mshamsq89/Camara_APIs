FROM openjdk:17-jdk-slim
WORKDIR /app
COPY target/devicelocation-0.0.1-SNAPSHOT.jar app.jar
ENTRYPOINT ["java", "-jar", "app.jar"]
