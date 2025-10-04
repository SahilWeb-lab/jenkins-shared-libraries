// define function
def call() {
  echo "Building Start...."
  sh "docker build -t notes-app:latest ."
  echo "Building Success!"
}
