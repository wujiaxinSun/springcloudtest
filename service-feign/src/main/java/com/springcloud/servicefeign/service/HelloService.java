package com.springcloud.servicefeign.service;


import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "EUREKA-CLIENT",fallback = HelloServiceImpl.class)
public interface HelloService {

    @RequestMapping(value = "/hi",method = RequestMethod.GET)
    String sayHiFromFeignClient(@RequestParam(value = "name") String name);

}
