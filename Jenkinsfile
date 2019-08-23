pipeline {
  agent any
  stages {
        stage('Change Directory to Pom source') {
      steps {
        cd mvn-cmd/
      }
    }
    stage('Clean') {
      steps {
        mvn clean
      }
    }
    stage('Compile') {
      steps {
        mvn compile
      }
    }
    stage('Test') {
      steps {
        mvn test
      }
    }
  }
}
