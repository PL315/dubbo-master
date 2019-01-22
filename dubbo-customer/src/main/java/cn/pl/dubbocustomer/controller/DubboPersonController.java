package cn.pl.dubbocustomer.controller;

import cn.pl.dubbocustomer.service.DubboPersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *@Author PL
 *@Date 2019/1/22 14:21
 *@Description TODO
 **/
@RestController
@RequestMapping("person")
public class DubboPersonController {

    @Autowired
    DubboPersonService dubboPersonService;

    @RequestMapping("/say")
    public String say(){
        return dubboPersonService.say();
    }
}
