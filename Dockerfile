FROM openjdk:11

COPY target/dockerapp.jar /usr/app/

WORKDIR /usr/app/

ENTRYPOINT ["java", "-jar", "dockerapp.jar"]