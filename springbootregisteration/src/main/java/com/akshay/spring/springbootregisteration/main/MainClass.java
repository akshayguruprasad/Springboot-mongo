package com.akshay.spring.springbootregisteration.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.RestController;

/**
 * 
 * @author Akshay
 *
 */

@RestController
@EnableAutoConfiguration
@ComponentScan(basePackages= {"com.akshay.spring.springbootregisteration.service","com.akshay.spring.springbootregisteration.dao"})
public class MainClass {

	public static void main(String[] args) {

		SpringApplication.run(MainClass.class, args);

	}

}
