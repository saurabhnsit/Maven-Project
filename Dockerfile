FROM openjdk:11
ADD target/Basics-1.0-SNAPSHOT-jar-with-dependencies.jar my-maven-docker-project.jar
ENTRYPOINT ["java", "-jar","my-maven-docker-project.jar"]
EXPOSE 8080