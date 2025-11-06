# Use official JDK 17 base image
FROM eclipse-temurin:17-jdk-alpine

# Set app directory
WORKDIR /app

# Copy the JAR file built by Maven
COPY target/people-jar-mongo-redis-0.0.1-SNAPSHOT.jar app.jar

# Expose port 8080
EXPOSE 8080

# Run the app
ENTRYPOINT ["java", "-jar", "app.jar"]