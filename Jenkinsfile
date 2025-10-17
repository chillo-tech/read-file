pipeline {
    agent any

    stages {
        stage('Cloner le répertoire') {
            steps {
                checkout([
                    $class: 'GitSCM', 
                    branches: [[name: "main"]],
                    userRemoteConfigs: [[
                        credentialsId: "chillo-tech",
                        url: 'https://github.com/chillo-tech/read-file.git',
                    ]]
                ])
                echo "Cloner le projet"

            }
        }
        stage('Test') {
            steps {
                sh 'ls -al'
                //def path = Paths.get("servers.csv")
                def lines = readFile("servers.csv")

                lines.eachWithIndex {line, index -> echo "$line"}
            }
        }
        stage('Deploy') {
            steps {
                sh 'ls -al'
               
            }
        }
    }
}
