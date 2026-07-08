def call(String username, String image){
  withCredentials([string(credentialsId: 'docker_pass', variable: 'dh_password')]) {
  sh "docker image tag ${image} ${username}/${image}:${env.BUILD_NUMBER}"
  sh "docker login -u ${username} -p $dh_password "
  sh "docker push ${username}/${image}:${env.BUILD_NUMBER}"
  }
}
