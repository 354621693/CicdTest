FROM openjdk:8-jdk-alpine
MAINTAINER liwencan
#VOLUME /tmp
RUN mkdir /app
ARG JAR_FILE=target/*.jar
#COPY ${JAR_FILE} /app/app.jar
COPY target/*.jar /app/app.jar
WORKDIR /app
EXPOSE 8081
CMD ["java","-jar","app.jar"]