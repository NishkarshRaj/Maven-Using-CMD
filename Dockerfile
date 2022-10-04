FROM openjdk:8
# Add Commoand here first unzip the file and then copy to container
ADD target/mvn-cmd-1.0-SNAPSHOT.jar helloworld.jar
# Print hello message to check successful image
ENTRYPOINT ["java","-jar","helloworld.jar"]
