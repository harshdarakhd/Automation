package com.amdocs.Flipkart;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.test.context.TestConfiguration;

@TestConfiguration(proxyBeanMethods = false)
public class TestFlipkartProjectApplication {

	public static void main(String[] args) {
		SpringApplication.from(FlipkartProjectApplication::main).with(TestFlipkartProjectApplication.class).run(args);
	}

}
