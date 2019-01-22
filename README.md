# dubbo-master
springboot 整合阿里的dubbo-spring-boot-starter demo

## dubbo-provider
1、引入依赖

```xml
 <!--dubbo 开箱包-->
  <dependency>
    <groupId>com.alibaba.spring.boot</groupId>
    <artifactId>dubbo-spring-boot-starter</artifactId>
    <version>2.0.0</version>
  </dependency>
  <!--zookeeper 依赖包-->
  <dependency>
    <groupId>org.apache.zookeeper</groupId>
    <artifactId>zookeeper</artifactId>
    <version>3.4.11</version>
  </dependency>
  <dependency>
    <groupId>com.101tec</groupId>
    <artifactId>zkclient</artifactId>
    <version>0.10</version>
  </dependency>
```
2、配置application.xml
```yaml
server:
  port: 8083
spring:
  dubbo:
    application:
      name: dubbo-provider  
      id: dubbo-provider
    registry:
      address: zookeeper://127.0.0.1:2181
    server: true
    protocol:
      name: dubbo
      port: 20881
```
3、使用dubbo注解注册服务
```java
package cn.pl.dubboprovider.service;

import cn.pl.dubbo.IPersonService;
import com.alibaba.dubbo.config.annotation.Service;
import org.springframework.stereotype.Component;

/**
 *@Author PL
 *@Date 2019/1/22 13:40
 *@Description TODO
 **/
@Component
@Service(interfaceClass = IPersonService.class)
public class personService implements IPersonService{
    @Override
    public String say() {
        System.out.println("进入provider2 服务");
        return "hello word2";
    }
}

```

4、 配置启动类注解
```java
package cn.pl.dubboprovider;

import com.alibaba.dubbo.spring.boot.annotation.EnableDubboConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@SpringBootApplication
@EnableDubboConfiguration
public class DubboProviderApplication {
	public static void main(String[] args) {
		SpringApplication.run(DubboProviderApplication.class, args);
	}
}

```
