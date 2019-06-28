FROM openjdk:11

ADD  ./target/MuzixApplication-0.0.1-SNAPSHOT.jar //

ENTRYPOINT  ["java","-jar","MuzixApplication-0.0.1-SNAPSHOT.jar"]
EXPOSE 8080