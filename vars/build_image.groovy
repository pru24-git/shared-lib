def call(String tag){
  sh "docker build -t ${tag} ."
}
