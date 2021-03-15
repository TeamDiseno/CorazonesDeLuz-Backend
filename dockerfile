#-----NO TOCAR---------
#--------------
#BUILD STAGE
#---------------
FROM maven:3.6.3-jdk-14 as build
COPY src /home/app/src
COPY pom.xml /home/app/
RUN mvn -f /home/app/pom.xml clean package

#-------------
#Package stage
#-------------
FROM openjdk:14-alpine
COPY --from=build /home/app/target/RegistrarUsuario_0.1-0.0.1.jar /usr/local/lib/demo.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","/usr/local/lib/demo.jar"]
