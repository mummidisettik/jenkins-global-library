package linuxacademy.git;

def gitCommit(gitPath) {
	return "/bin/git --git-dir=${gitPath} rev-parse Head".execute().text
}
