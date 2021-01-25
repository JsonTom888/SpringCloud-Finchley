package com.feign.sericefeign.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author tom
 * @version V1.0
 * @date 2021/1/25 22:28
 */
@FeignClient(value = "server-client")
public interface ScheduleServiceHello {

    @RequestMapping(value = "/hello",method = RequestMethod.GET)
    String sayHelloFromClientOne(@RequestParam(value = "name")String name);

}
