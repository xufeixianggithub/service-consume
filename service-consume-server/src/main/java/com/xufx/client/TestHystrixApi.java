package com.xufx.client;

import com.xufx.Fallback.TestHystrixFallback;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "micro-service", fallbackFactory = TestHystrixFallback.class)
public interface TestHystrixApi{
    @RequestMapping(value = "/say", method = RequestMethod.GET)
    String say();

    @RequestMapping(value = "/test1", method = RequestMethod.GET)
    String test1();

    @RequestMapping(value = "/test2", method = RequestMethod.GET)
    String test2(@RequestParam(required = false, value = "backendUserId") String value);
}

