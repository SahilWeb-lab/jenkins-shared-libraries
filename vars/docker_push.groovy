def call(String imageName, String imageTag) {
  echo "Pushing start to docker hub."
  withCredentials([usernamePassword(
      credentialsId:"DockerHubCredentials", 
      passwordVariable:"DockerHubPass", 
      usernameVariable:"DockerHubUser")]) {
  sh "docker login -u ${env.DockerHubUser} -p ${env.DockerHubPass}"
  // sh "docker image tag notes-app:latest ${env.DockerHubUser}/notes-app:latest"
  sh "docker push ${env.DockerHubUser}/${imageName}:${imageTag}"
  }
  echo "Pushing finshed to docker hub."
}
