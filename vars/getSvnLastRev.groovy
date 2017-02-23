def call(String svnUrl) {
	def svnInfo = "";
	if(isUnix) {
		def svnInfo = sh script: "svn info ${svnUrl}", returnStdout: true
	} else {
		def svnInfo = bat script: "svn info ${svnUrl}", returnStdout: true
	}
    def matcher = svnInfo =~ 'Letzte.*Rev:\\s(\\d+)'
	return matcher ? matcher[0][1] : null
}