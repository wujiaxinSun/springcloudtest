package com.springcloud.servicefeign.service;

import org.springframework.stereotype.Service;

@Service
public class HelloServiceImpl implements HelloService {


    @Override
    public String sayHiFromFeignClient(String name) {
        return null;
    }
}
