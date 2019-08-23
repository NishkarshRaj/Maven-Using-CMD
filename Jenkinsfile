pipeline {
  agent any
  stages 
    {
    stage('Clean') {
      steps {
        bat 'mvn clean'
      }
    }
    stage('Compile') {
      steps {
        bat 'mvn compile'
      }
    }
    stage('Test') {
      steps {
        bat 'mvn test'
      }
    }
  }
}
