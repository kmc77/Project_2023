FROM openjdk:17-ea-11-jdk-slim
COPY ./target/ITDA_private-0.0.1-SNAPSHOT.war /security.war
ENTRYPOINT ["java", "-jar", "security.war"]