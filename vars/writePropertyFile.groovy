@NonCPS
def writePropertyFile(filepath, entries) {
	def ant = new AntBuilder()
	ant.propertyfile(file: filepath) {
	    entries.each { k, v ->
	        ant.entry(key: k, value: v)
	    }
	}
	ant = null
}
