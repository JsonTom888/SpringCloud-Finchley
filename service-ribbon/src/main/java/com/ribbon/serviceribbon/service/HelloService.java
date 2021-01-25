package com.ribbon.serviceribbon.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * @author tom
 * @version V1.0
 * @date 2021/1/24 23:16
 */
@Service
public class HelloService {

    @Autowired
    RestTemplate restTemplate;

    @HystrixCommand(fallbackMethod = "helloError")
    public String helloService(String name) {
        return restTemplate.getForObject("http://SERVER-CLIENT/hello?name="+name,String.class);
    }

    public String helloError(String name){
        return "hello "+name+" ,sorry,error occured";
    }

}
