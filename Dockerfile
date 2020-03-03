FROM tomcat:latest
MAINTAINER rob

EXPOSE 8080

COPY build/libs/*.war /usr/local/tomcat/webapps/api.war