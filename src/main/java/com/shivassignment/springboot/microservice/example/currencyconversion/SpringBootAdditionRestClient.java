package com.shivassignment.springboot.microservice.example.currencyconversion;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
@ComponentScan({"com.shivassignment.springboot.microservice"})
//@EntityScan("com.in28minutes.springboot.microservice.example.document")
@EnableMongoRepositories("com.shivassignment.springboot.microservice.repository")
//@org.springframework.cloud.openfeign.EnableFeignClients("com.shivassignment.springboot.microservice.example.currencyconversion")
public class SpringBootAdditionRestClient {

  public static void main(String[] args) {
    SpringApplication.run(SpringBootAdditionRestClient.class, args);
  }
}