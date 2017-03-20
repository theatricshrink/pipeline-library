@NonCPS
def call(configName) {
	def globalconfigfile
	configFileProvider([configFile(fileId: 'global-pipeline-config', variable: 'conf')]) {
		globalconfigfile = readFile(file: conf)
 	}
	return readProperties(text: globalconfigfile)
}
