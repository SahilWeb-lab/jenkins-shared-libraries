def call(String imageName, String imageTag) {
  echo "Pushing start to docker hub."
  withCredentials([usernamePassword(
      credentialsId:"DockerHubCred", 
      passwordVariable:"DOCKER_USER", 
      usernameVariable:"DOCKER_PASSWORD")]) {
  sh "docker login -u ${env.DOCKER_USER} -p ${env.DOCKER_PASSWORD}"
  // sh "docker image tag notes-app:latest ${env.DockerHubUser}/notes-app:latest"
  sh "docker push ${env.DOCKER_USER}/${imageName}:${imageTag}"
  }
  echo "Pushing finshed to docker hub."
}
