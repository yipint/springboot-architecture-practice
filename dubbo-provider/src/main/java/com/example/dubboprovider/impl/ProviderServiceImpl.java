package com.example.dubboprovider.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.example.dubboapi.service.ProviderService;

@Service(version = "1.0.0")
public class ProviderServiceImpl implements ProviderService {
    @Override
    public String sayHello(String content) {
        return String.format("hello %s!",content);
    }
}
