def call(String image, int port){
sh 'docker run --name "${image}" -p "${port}:${port}" "${image}" '
}
