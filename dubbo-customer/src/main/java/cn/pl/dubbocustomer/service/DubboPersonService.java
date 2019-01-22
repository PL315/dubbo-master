package cn.pl.dubbocustomer.service;

import cn.pl.dubbo.IPersonService;
import com.alibaba.dubbo.config.annotation.Reference;
import org.springframework.stereotype.Component;

/**
 *@Author PL
 *@Date 2019/1/22 14:20
 *@Description TODO
 **/
@Component
public class DubboPersonService {

    @Reference
    private IPersonService iPersonService;

    public String say(){
        return iPersonService.say();
    }
}
