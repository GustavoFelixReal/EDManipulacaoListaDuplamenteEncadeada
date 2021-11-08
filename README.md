
FROM openjdk:11
LABEL maintainer="Gustavo Felix"
RUN apt-get update
RUN mkdir /usr/src/myapp
RUN mkdir /usr/src/newapps
RUN chmod -R 777 /usr/src
COPY . /usr/src/myapp
RUN rm /usr/src/myapp/Dockerfile
WORKDIR /usr/src/newapps
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "/usr/src/myapp/F1.jar"]
VOLUME /usr/src/newapps
