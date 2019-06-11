package com.dubbo.demo.consume;

import com.dubbo.demo.api.DemoService;

public class DemoServiceImpl implements DemoService {
    public String sayHello(String name) {
        return "Hello:"+name;
    }
}
