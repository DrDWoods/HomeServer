# Use an official OpenJDK runtime as a parent image
FROM openjdk:21-jdk

# Set the working directory inside the container
WORKDIR /app

# Copy the build files from the local machine into the container
COPY api/build/libs/kotlin-api.jar app.jar
#COPY api/src/main/resources/application.yaml /app/resources/application.yaml

# Expose the application port (optional, depends on your application)
EXPOSE 8080

# Run the jar file when the container starts
ENTRYPOINT ["java", "-jar", "/app/app.jar"]