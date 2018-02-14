package com.wisdom.demo;

import org.springframework.context.annotation.*;

@Configuration
public class HelloWorldConfig {

	@Bean
	public HelloWorld retFunc() {
		HelloWorld x = new HelloWorld();
		x.setMessage("Hello world!!!");
		return x;
		
	}
}
