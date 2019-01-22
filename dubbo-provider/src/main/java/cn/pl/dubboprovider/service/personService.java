package cn.pl.dubboprovider.service;

import cn.pl.dubbo.IPersonService;
import com.alibaba.dubbo.config.annotation.Service;
import com.sun.org.apache.xpath.internal.SourceTree;
import org.springframework.context.annotation.ComponentScan;
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
