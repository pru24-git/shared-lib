def call(String username, String image, int tag_number){
  withCredentials([string(credentialsId: 'docker_pass', variable: 'dh_password')]) {
  sh "docker image tag ${image} ${username}/${image}:${tag_number}"
  sh "docker login -u ${username} -p $dh_password "
  sh "docker push ${username}/${image}:${tag_number}
}
