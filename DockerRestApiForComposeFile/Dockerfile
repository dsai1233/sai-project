FROM openjdk:17
COPY target/DockerRestApiForComposeFile.jar /usr/app/DockerRestApiForComposeFile.jar
WORKDIR usr/app/
EXPOSE 9090
ENTRYPOINT [ "java","-jar","/usr/app/DockerRestApiForComposeFile" ]