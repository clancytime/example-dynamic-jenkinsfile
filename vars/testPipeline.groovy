def call() {
    pipeline {
        agent any
        stages {
            stage('Example') {
                steps {
                    echo 'example dynamic pipeline run'
                }
            }
        }
    }
}