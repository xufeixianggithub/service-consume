package com.xufx.controller;

import com.xufx.client.TestHystrixApi;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class TestController {
    @Autowired
    private TestHystrixApi testHystrixApi;
    private static final Logger logger=LoggerFactory.getLogger(TestController.class);
    @RequestMapping(value = "/say",method = RequestMethod.GET)
    public String say(){
        System.out.println("123");
        //return testsFeignClient.say();
        return testHystrixApi.say();

        //return "123";
    }

    @RequestMapping(value = "/aa",method = RequestMethod.GET)
    public String aa(){

        return "123";
    }
}
