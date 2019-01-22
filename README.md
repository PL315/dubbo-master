# dubbo-master
springboot 整合阿里的dubbo-spring-boot-starter demo

## dubbo-provider
```yaml
server:
  port: 8083
spring:
  dubbo:
    application:
      name: dubbo-provider  #服务名称
      id: dubbo-provider
    registry:
      address: zookeeper://127.0.0.1:2181
    server: true
    protocol:
      name: dubbo
      port: 20881
```

