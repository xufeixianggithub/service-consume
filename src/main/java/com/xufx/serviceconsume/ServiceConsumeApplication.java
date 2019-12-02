package com.xufx.serviceconsume;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients("com.seeapp")
public class ServiceConsumeApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServiceConsumeApplication.class, args);
	}

}
