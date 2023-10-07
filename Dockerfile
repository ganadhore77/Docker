# Use an official OpenJDK runtime as a parent image
FROM openjdk:11

# Set the working directory inside the container
WORKDIR /usr/app

# Copy the compiled JAR file into the container at the specified working directory
COPY target/dockerapp.jar . 

# Expose the port that your Spring Boot application will run on (default is 8080)
EXPOSE 8080

# Define the command to run your application when the container starts
CMD ["java", "-jar", "dockerapp.jar"]
