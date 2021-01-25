package com.feign.sericefeign.service;

import org.springframework.stereotype.Component;

/**
 * @author tom
 * @version V1.0
 * @date 2021/1/25 23:00
 */
@Component
public class SchedualServiceHelloHystric implements ScheduleServiceHello {
    @Override
    public String sayHelloFromClientOne(String name) {
        return "sorry "+name+" had occured";
    }
}
