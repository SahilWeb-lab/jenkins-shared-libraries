def call() {
  echo "Deploying Start...."
  // sh "docker run -d -p 8000:8000 notes-app:latest"
  sh "docker compose up -d"
  echo "Deploying Success!"
}
