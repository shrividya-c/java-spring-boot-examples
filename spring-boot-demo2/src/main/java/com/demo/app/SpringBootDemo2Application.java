package com.demo.app;

import com.demo.app.model.Alien;
import com.demo.app.service.LaptopService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringBootDemo2Application {

	public static void main(String[] args) {

		ApplicationContext applicationContext = SpringApplication.run(SpringBootDemo2Application.class, args);
//		Alien a = applicationContext.getBean(Alien.class);
//		System.out.println("age:"+ a.getAge());
//		a.getComputer().compile();

		LaptopService ls = applicationContext.getBean(LaptopService.class);
		ls.saveLaptop();
	}

}
