def call(String url, String branch) {
  echo "Code cloning start."
  git url: "${url}", branch: "${branch}"
  echo "Code cloning finshed."
}
