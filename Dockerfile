FROM openjdk:8
EXPOSE 8085
ADD target/forpresentationcicd_1.jar forpresentationcicd_1.jar
ENTRYPOINT ["java","-jar","forpresentationcicd_1.jar"]