def call(String Project, String ImageTag, String dockerhubuser){
  withCredentials([usernamePassword(credentialsId: 'docker', passwordVariable: 'DOCKERHUB_PASS', usernameVariable: 'DOCKERHUB_USER')]) {
      sh """
        echo \$DOCKERHUB_PASS | docker login -u \$DOCKERHUB_USER --password-stdin
        docker push \$DOCKERHUB_USER/${Project}:${ImageTag}
      """
  }
}
