# microservices-zk

This is a distributed tracing based on ZK [V3.6.3](http://zookeeper.apache.org/releases.html).

## ZK Run
```bash
zkServer.sh start
```
### ZK command line
```bash
zkCli.sh
```
search services:
```bash
ls /services
```

## user service
* user-service [springcloud-zk-user-service](https://github.com/tdtc-hrb/microservices-zookeeper/tree/master/springcloud-zk-user-service)
* userDetails [springcloud-zk-userDetails](https://github.com/tdtc-hrb/microservices-zookeeper/tree/master/springcloud-zk-userDetails)

## gate way
* [gateway-dev](https://github.com/tdtc-hrb/microservices-zookeeper/tree/master/springcloud-gateway-dev)


## Build
```
mvn clean package -DskipTests
```

## Document
* Distributed traceability with Spring Cloud: [Sleuth and Zipkin](https://tdtc-hrb.github.io/cnblogs/post/trace-zipkin-config/)
* [Install and Configure Apache Kafka](https://tdtc-hrb.github.io/cnblogs/post/mq-kafka-config/)
