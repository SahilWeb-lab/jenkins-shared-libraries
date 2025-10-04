def call(String url, String branch) {
  echo "Cloning code from github..."
  git url: url, branch: branch
  echo "Cloning Success!"
}
