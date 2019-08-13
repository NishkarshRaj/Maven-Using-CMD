pipeline {
    agent any

    stages {
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
