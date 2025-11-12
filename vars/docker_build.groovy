// define function
def call(String username, String imageName, String imageTag) {
  echo "Code building start."
  sh "docker build -t ${username}/${imageName}:${imageTag} ."
  echo "Code building finished."
}
