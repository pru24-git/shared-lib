def call(String image, int port){
sh "docker run -d --name ${image} -p ${port}:${port} ${image} "
}
