# !!! Run from parent directory only, maybe i'll fix it in next versions but who knows !!!
#
# Build stage
#
FROM maven:3.6.0-jdk-11-slim AS build
COPY restapihehe/rest/src demolahehe/src
COPY restapihehe/rest/pom.xml /demolahehe
RUN mvn -f demolahehe/pom.xml clean package

#
# Package stage
#
FROM openjdk:11-jre-slim
COPY --from=build demolahehe/target/rest-0.0.1-SNAPSHOT.jar /usr/local/lib/demo.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","/usr/local/lib/demo.jar"]
