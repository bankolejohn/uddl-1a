// pipeline {
//     agent any
    
//     stages {
//         stage('Checkout') {
//             steps {
//                 checkout scm
//             }
//         }
        
//         stage('Set up JDK 17') {
//             steps {
//                 script {
//                     // Set up JDK 17 using Temurin distribution
//                     tool 'jdk-17'
//                 }
//             }
//         }
        
//         stage('Build and Collect JARs') {
//             steps {
//                 script {
//                     // Create a directory to store JAR files
//                     sh 'mkdir -p jar-artifacts'
                    
//                     // Run Maven package in the root directory
//                     sh 'mvn clean install'
                    
//                     // Copy JAR files to the common folder
//                     sh 'cp */target/*.jar jar-artifacts/'
//                 }
//             }
//         }
        
//         stage('Publish Artifact') {
//             steps {
//                 // Archive the JAR artifacts
//                 archiveArtifacts artifacts: 'jar-artifacts/*', allowEmptyArchive: true
//             }
//         }
        
//         stage('Get Artifact Download URL') {
//             steps {
//                 script {
//                     // Get Artifact Download URL
//                     def artifactUrl = "https://github.com/${env.GITHUB_REPOSITORY}/actions/runs/${env.GITHUB_RUN_ID}/artifacts"
                    
//                     // Write Artifact URL to a text file
//                     writeFile file: 'jar-artifacts/artifact_url.txt', text: "Artifact URL: ${artifactUrl}"
//                 }
//             }
//         }
//     }
// }


pipeline {
    agent any

    // Define stages for your build
    stages {
        // Checkout stage 1 (main project)
        stage('Checkout Stage 1') {
            steps {
                // Use Git SCM plugin to checkout the first repository
                git branch: 'main',
                    // credentialsId: 'your_github_credentials_id', // Replace with your credentials ID
                    url: 'https://github.com/bankolejohn/uddl-1a.git'

                // Build and install the project using Maven
                // sh 'mvn clean install -Djava.version=17' // Set Java version to 17
                sh 'mvn -t ${Maven} clean install -Djava.version=17'
            }
        }

        // Checkout stage 2 (dependent project)
        stage('Checkout Stage 2') {
            steps {
                // Use Git SCM plugin to checkout the second repository
                git branch: 'main',
                    credentialsId: 'your_github_credentials_id', // Replace with your credentials ID
                    url: 'https://github.com/bankolejohn/uddl-1b.git'

                // Configure Maven to use the local repository from stage 1
                sh 'mvn clean install -Djava.version=17 -Dsettings.local=./.m2/settings.xml'
            }
        }
    }
}


// pipeline {
//     agent any

//     // Define stages for your build
//     stages {
//         // Checkout stage 1 (main project)
//         stage('Checkout Stage 1') {
//             steps {
//                 // Use Git SCM plugin to checkout the first repository
//                 git branch: 'main',
//                     // credentialsId: 'your_github_credentials_id', // Replace with your credentials ID
//                     url: 'https://github.com/bankolejohn/uddl-1a.git'

//                 // Build and install the project using Maven
//                 // sh 'mvn clean install -Djava.version=17' // Set Java version to 17
//                 script {
//                     // Use the 'bat' step for Windows, and 'sh' for Unix-like systems
//                     bat 'mvn clean install -Djava.version=17'
//                 }
//             }
//         }

//         // Checkout stage 2 (dependent project)
//         stage('Checkout Stage 2') {
//             steps {
//                 // Use Git SCM plugin to checkout the second repository
//                 git branch: 'main',
//                     credentialsId: 'your_github_credentials_id', // Replace with your credentials ID
//                     url: 'https://github.com/bankolejohn/uddl-1b.git'

//                 // Configure Maven to use the local repository from stage 1
//                 script {
//                     // Use the 'bat' step for Windows, and 'sh' for Unix-like systems
//                     bat 'mvn clean install -Djava.version=17 -Dsettings.local=./.m2/settings.xml'
//                 }
//             }
//         }
//     }
// }

