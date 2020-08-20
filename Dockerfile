FROM openjdk:8-jre-alpine
RUN mkdir app
COPY /target/redis-quartz.jar /app/redis-quartz.jar
EXPOSE 8081
WORKDIR app
RUN ["chmod", "777", "redis-quartz.jar"]
CMD ["java", "-jar", "redis-quartz.jar"]