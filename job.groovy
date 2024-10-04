freeStyleJob('test-job') {
    steps {
        triggers {
            cron("H/10 * * * *")
        }
        shell('''cd $JENKINS_HOME/git_repo_refs
for d in */; do
    cd $d
    git fetch
    echo tmp log
    cd ..
done''')
    }
}
