package com.feign.sericefeign.controller;

import com.feign.sericefeign.service.ScheduleServiceHello;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author tom
 * @version V1.0
 * @date 2021/1/25 22:33
 */
@RestController
public class HelloController {

    @Autowired
    ScheduleServiceHello scheduleServiceHello;

    @RequestMapping("/hello")
    public String sayHi(@RequestParam String name){
        return scheduleServiceHello.sayHelloFromClientOne(name);
    }

}
