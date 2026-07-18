pipeline {
    agent { label 'lingu'}

    environment {
        IMAGE_NAME = "node-web"
        CONTAINER_NAME = "node-web-container"
        IMAGE_TAG = "latest"
    }

    stages {

        stage('Checkout Source') {
            steps {
                echo "Cloning repository..."
                checkout scm
            }
        }

        stage("Verify Docker") {
            steps {
                sh 'docker --version'
                sh 'docker info'
            }
        }

        stage('Build Docker Image') {
            steps {
                dir('web-images/node-web') {
                    sh 'docker build -t ${IMAGE_NAME}:${IMAGE_TAG} .'
                }
            }
        }

        stage('Remove Old Container') {
            steps {
                sh '''
                docker rm -f ${CONTAINER_NAME} || true
                '''
            }
        }

        stage('Run Container') {
            steps {
                sh '''
                docker run -d \
                --name ${CONTAINER_NAME} \
                -p 3000:3000 \
                ${IMAGE_NAME}:${IMAGE_TAG}
                '''
            }
        }

        stage('Verify Deployment') {
            steps {
                sh 'docker ps'
            }
        }

    }
   stage('Push to Docker Hub') {
    steps {
        withCredentials([usernamePassword(
            credentialsId: 'dockerHubCred',
            usernameVariable: 'DOCKER_USER',
            passwordVariable: 'DOCKER_PASS'
        )]) {

            sh '''
            echo "$DOCKER_PASS" | docker login -u "$DOCKER_USER" --password-stdin

            docker tag images-demo:latest $DOCKER_USER/images-demo:latest

            docker push $DOCKER_USER/images-demo:latest
            '''
        }
    }
}
    }

    post {

        success {
            echo "Build completed successfully."
        }

        failure {
            echo "Build failed."
        }

        always {
            echo "Pipeline finished."
        }

    }
}
