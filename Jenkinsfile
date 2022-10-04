pipeline {
  agent any
  stages 
    {
    stage('Clean The Maven') {
      steps {
        bat 'mvn clean'
      }
    }
    stage('Compile The Java File') {
      steps {
        bat 'mvn compile'
      }
    }
    stage('Test The File') {
      steps {
        bat 'mvn test'
      }
    }
  }
}
