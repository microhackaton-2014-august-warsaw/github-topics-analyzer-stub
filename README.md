github-topics-analyzer-stub
===========================

###To test the stub itself locally:

gradle fatJar

java -jar github-collector-stub-VERSION-shadow.jar \<zooKeeperBasePath\> \<stubName\> \<stubPortNumber\> \<zookeeperPortNumber\>

java -jar build\libs\github-topics-analyzer-stub-CD-000-shadow.jar /pl/pl/microhackaton github-topics-analyzer 8911 2181
