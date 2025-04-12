# Dockerfile (inside DevopsTraining folder)

FROM openjdk:21-jdk-slim
COPY target/Tora-1.0-SNAPSHOT.jar app.jar
ENTRYPOINT ["java", "-jar", "app.jar"]
