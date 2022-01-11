package com.example.dubboconsumer;

import com.alibaba.dubbo.config.annotation.Reference;
import com.example.dubboapi.service.ProviderService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Consumer {
    @Reference(version ="1.0.0")
    public ProviderService service;

    @GetMapping(value = "/hello/{content}")
    public String hello(@PathVariable String content) {
        return service.sayHello(content);
    }
}
