FROM java:8
EXPOSE 8080
CMD java -jar /java-docker.jar
ADD target/java-docker-0.0.1-SNAPSHOT.jar /java-docker.jar
