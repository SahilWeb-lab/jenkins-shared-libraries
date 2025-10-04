def call(String imageName, String imageTag) {
  echo "Pushing code to dockerhub...."
  withCredentials([usernamePassword(
      credentialsId:"DockerHubCredentials", 
      passwordVariable:"DockerHubPass", 
      usernameVariable:"DockerHubUser")]) {
  sh "docker login -u ${env.DockerHubUser} -p ${env.DockerHubPass}"
  sh "docker image tag notes-app:latest ${env.DockerHubUser}/notes-app:latest"
  sh "docker push ${env.DockerHubUser}/'${imageName}':'${imageTag}'"
  }
  echo "Code Pushed Success!"
}
