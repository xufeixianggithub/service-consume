package com.xufx.Fallback;

import com.xufx.client.TestHystrixApi;
import feign.hystrix.FallbackFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;
@Component
public class TestHystrixFallback implements FallbackFactory<TestHystrixApi>{

    private static final Logger log= LoggerFactory.getLogger(TestHystrixFallback.class);

    @Override
    public TestHystrixApi create(Throwable throwable) {
        String msg = throwable == null ? "" : throwable.getMessage();
        if (!StringUtils.isEmpty(msg)) {
            log.error(msg);
        }
        return new TestHystrixApi(){

            @Override
            public String say() {
                return "say暂时不提供服务";
            }

            @Override
            public String test1() {
                return "test1暂时不提供服务";
            }

            @Override
            public String test2(String value) {
                return "test2暂时不提供服务";
            }
        };
    }
}
