pipeline {
    agent {
        docker {
            image 'maven:3-alpine'
            args '-v /tmp/.m2:/tmp/.m2'
        }
    }
    options {
        skipStagesAfterUnstable()
    }
    stages {
        stage('Build') {
            steps {
                sh 'mvn -f ./shipment-service/pom.xml -B -DskipTests clean package'
            }
        }
        stage('Test') {
            steps {
                sh 'cd shipment-service'
                sh 'mvn -f shipment-service/pom.xml test'
            }
            post {
                always {
                    junit ' shipment-service/target/surefire-reports/*.xml'
                }
            }
        }
        stage('Coverage') {
            steps {
                sh 'mvn -f shipment-service/pom.xml clean package jacoco:report'
            }
            post {
                always {
                    publishCoverage adapters: [jacocoAdapter('shipment-service/target/site/jacoco/jacoco.xml')]
                }
            }
        }
    }
}