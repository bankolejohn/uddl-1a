pipeline {
    agent any
    
    stages {
        stage('Checkout') {
            steps {
                checkout scm
            }
        }
        
        stage('Set up JDK 17') {
            steps {
                script {
                    // Set up JDK 17 using Temurin distribution
                    tool 'jdk-17'
                }
            }
        }
        
        stage('Build and Collect JARs') {
            steps {
                script {
                    // Create a directory to store JAR files
                    sh 'mkdir -p jar-artifacts'
                    
                    // Run Maven package in the root directory
                    sh 'mvn clean install'
                    
                    // Copy JAR files to the common folder
                    sh 'cp */target/*.jar jar-artifacts/'
                }
            }
        }
        
        stage('Publish Artifact') {
            steps {
                // Archive the JAR artifacts
                archiveArtifacts artifacts: 'jar-artifacts/*', allowEmptyArchive: true
            }
        }
        
        stage('Get Artifact Download URL') {
            steps {
                script {
                    // Get Artifact Download URL
                    def artifactUrl = "https://github.com/${env.GITHUB_REPOSITORY}/actions/runs/${env.GITHUB_RUN_ID}/artifacts"
                    
                    // Write Artifact URL to a text file
                    writeFile file: 'jar-artifacts/artifact_url.txt', text: "Artifact URL: ${artifactUrl}"
                }
            }
        }
    }
}
