package com.example.DemoApp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
public class MyAppApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(MyAppApplication.class, args);

	}
}
