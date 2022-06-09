FROM openjdk:8
ADD target/polling-0.0.1-SNAPSHOT.jar polling.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "polling.jar"]