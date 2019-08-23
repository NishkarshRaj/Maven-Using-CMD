pipeline {
  agent any
  stages 
    {
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
