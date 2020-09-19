FROM openjdk:8
ADD target/mvn-cmd-1.0-SNAPSHOT.jar helloworld.jar
# Print hello message to check successful image
ENTRYPOINT ["java","-jar","helloworld.jar"]
