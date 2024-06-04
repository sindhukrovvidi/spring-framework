package com.springframework.learnspringframework.helloworld;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

record Person(String name, int age) {};
record Address(String street, String city) {};

@Configuration
public class HelloWorldConfiguration {
	
	@Bean
	public String name() {
		return "Sindhu";
	}
	
	@Bean
	public Person person() {
		return new Person("Sindhu", 20);
	}
	
	@Bean
	public Address address() {
		return new Address("Street", "City");
	}
}
