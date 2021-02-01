package com.eureka.eurekaclient.controller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author tom
 * @version V1.0
 * @date 2021/1/24 22:36
 */
@RestController
public class HelloController {

    @Value("${server.port}")
    String port;

    @RequestMapping("/hello")
    public String home(@RequestParam(value = "name", defaultValue = "jsontom") String name) {
        return "hello " + name + " ,i am from port:" + port;
    }

    @RequestMapping("/hi")
    @HystrixCommand(fallbackMethod = "hiError")
    public String hi(@RequestParam(value = "name", defaultValue = "jsontom") String name) {
        return "hi " + name + " ,i am from port:" + port;
    }

    public String hiError(String name) {
        return "hi,"+name+",sorry,error!";
    }
}
