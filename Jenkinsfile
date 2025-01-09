pipeline {
    agent any

    stages {
        stage('Java Class') {
            steps {
                script{
                    if(isUnix()){
                    sh 'java /Users/erdembas/IdeaProjects/javaproject/src/topics/C01_HelloWorld.java'
                }else{
                    bat '/Users/erdembas/IdeaProjects/javaproject/src/topics/C01_HelloWorld.java'
                }
                }

            }
        }
    }
}
