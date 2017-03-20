def call(path) {
	if(fileExists(path)) {
		File file = new File("${pwd()}/${path}");
		def dir = file.isDirectory() ? true : false
		if(isUnix()) {
			if(dir) {
				sh "rm -R ${path}"
			} else {
				sh "rm ${path}"
			}
		} else {
			path = path.replaceAll('\\/','\\\\')
			if(dir) {
				bat "rmdir /s /q ${path}"
			} else {
				bat "del ${path}"
			}
		}
	}
}
