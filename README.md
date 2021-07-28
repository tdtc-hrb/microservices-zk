# microservices-zk

This is a distributed tracing based on ZK [V3.6.3](https://tdtc-hrb.github.io/csdn/post/ops_zookeeper/).

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
* user-service [springcloud-zk-user-service](https://github.com/xiaobin80/microservices-zk/tree/master/springcloud-zk-user-service)
* userDetails [springcloud-zk-userDetails](https://github.com/xiaobin80/microservices-zk/tree/master/springcloud-zk-userDetails)

## gate way
* zuul [gateway-zuul](https://github.com/xiaobin80/microservices-zk/tree/master/gateway-zuul)


## Run

### allow port
- zk port    
see [ops - firewall](https://tdtc-hrb.github.io/csdn/post/ops_firewall)
- RabbitMq port    
ubuntu:
```bash
sudo ufw allow 5672
```

### server
- CentOS    
3 centos(v7.9) running zk(v3.6.3)
- Ubuntu    
1 Ubuntu(v20.04) running MQ(RabbitMq v3.9.0/Erlang v24.0.4)
- WSL    
1 WSL(v1) running Es(v2.4)

### app
- gate way    
```bash
java -jar gateway-0.1.1-SNAPSHOT.jar
```
- user service    
```bash
java -jar user-service-0.1.1-SNAPSHOT.jar
```
- user details    
```bash
java -jar userDetails-0.1.1-SNAPSHOT.jar
```
- zipkin server    
```bash
java -jar zipkin-server-2.12.9-exec.jar --RABBIT_URI=amqp://admin:admin@192.168.0.55:5672/sleuth --STORAGE_TYPE=elasticsearch --ES_HOSTS=192.168.0.95:9200 --ES_HTTP_LOGGING=BASIC
```

### Broswer
- [RabbitMq](http://192.168.0.55:15672/)
- [Es v2.4](http://localhost:9200/_plugin/elasticsearch-head/)
- [list page](http://localhost:8311/user/listPage)


## Document
* Distributed traceability with Spring Cloud: [Sleuth and Zipkin](https://tdtc-hrb.github.io/cnblogs/post/trace-zipkin-config)