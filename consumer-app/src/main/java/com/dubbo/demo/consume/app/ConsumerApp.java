package com.dubbo.demo.consume.app;

import com.dubbo.demo.api.DemoService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ConsumerApp {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
        context.start();
        DemoService demoService=(DemoService)context.getBean("demoService");
        String dubbo = demoService.sayHello("dubbo");
        System.out.println(dubbo);
    }
}
