pipeline {
  agent any
  stages 
    {
    stage('Pom Source') {
      steps {
        cd mvn-cmd/
      }
    }
    stage('Clean') {
      steps {
        echo 'mvn clean'
      }
    }
    stage('Compile') {
      steps {
        echo 'mvn compile'
      }
    }
    stage('Test') {
      steps {
        echo 'mvn test'
      }
    }
  }
}