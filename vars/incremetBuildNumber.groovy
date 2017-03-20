@NonCPS
def call(filepath) {
	def ant = new AntBuilder()
	ant.buildnumber(file: filepath)
  ant = null
}
