// define function
def call(String username, String imageName, String imageTag) {
  echo "Building Start...."
  sh "docker build -t ${username}/${imageName}:${imageTag} ."
  echo "Building Success!"
}
