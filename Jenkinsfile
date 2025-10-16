pipeline {
    agent any

    stages {
        stage('Cloner le répertoire') {
            steps {
                git branch: "main" url: "https://github.com/chillo-tech/read-file.git"
            }
        }
        stage('Test') {
            steps {
                sh 'ls -al'
                sh 'cat servers.csv'
            }
        }
        stage('Deploy') {
            steps {
               
            }
        }
    }
}
