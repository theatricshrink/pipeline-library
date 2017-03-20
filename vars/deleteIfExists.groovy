def call(path,dir) {
	if(fileExists(path)) {
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
