package com.dubbo.demo.consume.app;

import com.dubbo.demo.api.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConsumerController {
    @Autowired
    public DemoService demoService;
    @RequestMapping("/test")
    public void test(){
        String test = demoService.sayHello("test");
    }
}
