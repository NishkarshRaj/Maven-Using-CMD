pipeline {
  agent any
  stages 
    {
    stage('Clean') {
      steps {
        cd mvn-cmd/
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
