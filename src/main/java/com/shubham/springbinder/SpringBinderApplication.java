package com.shubham.springbinder;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.InitBinder;

@SpringBootApplication
public class SpringBinderApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBinderApplication.class, args);
	}

	@ControllerAdvice
	public static class BindingControllerAdvice{

		@InitBinder
		public void initBinder(WebDataBinder webDataBinder){
			webDataBinder.initDirectFieldAccess();
		}
	}
}
