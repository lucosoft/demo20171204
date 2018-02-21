#FROM openjdk:8-jdk-alpine
## imagen base de java 8 con  jboss
##FROM jboss/base-jdk:8
## imagen base usada por redbee
##FROM frolvlad/alpine-oraclejdk8:slim
#ADD ./target/demo20171204-0.0.1-SNAPSHOT.jar /home
#WORKDIR /home
#EXPOSE 8081
#ENTRYPOINT ["java", "-jar" , "/home/demo20171204-0.0.1-SNAPSHOT.jar"]

#FROM openjdk
FROM openjdk:8-jdk-alpine
VOLUME /tmp
ADD ./target/demo20171204-0.0.1-SNAPSHOT.jar app.jar
RUN sh -c 'touch /app.jar'
ADD conf/entrypoint.sh /entrypoint.sh
RUN chmod +x entrypoint.sh
ENV JAVA_OPTS=""
ENTRYPOINT ["sh", "/entrypoint.sh","app.jar"]
#ENTRYPOINT ["java", "-jar" , "/demo20171204-0.0.1-SNAPSHOT.jar"]
