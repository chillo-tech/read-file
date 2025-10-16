pipeline {
    agent any

    stages {
        stage('Cloner le répertoire') {
            steps {
                // git branch: "main" url: "https://github.com/chillo-tech/read-file.git"
                checkout([
                    $class: 'GitSCM', 
                    // source: 'https://github.com/chillo-tech/read-file.git',
                    branches: [[name: "main"]],
                    userRemoteConfigs: [[
                        credentialsId: "chillo-tech"
                        url: 'https://github.com/chillo-tech/read-file.git',
                    ]]
                ])

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
