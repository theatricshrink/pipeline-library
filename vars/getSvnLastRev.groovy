def call(String svnInfo) {
    def matcher = svnInfo =~ 'Letzte.*Rev:\\s(\\d+)'
	return matcher ? matcher[0][1] : null
}