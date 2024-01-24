package com.codreal.chatservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
@SpringBootApplication
@ComponentScan({"com.codreal.chatservice","com.codreal.chatservice.controller","com.codreal.chatservice.repository","com.codreal.chatservice.model","com.codreal.chatservice.services","com.codreal.chatservice.exceptions"})
@EntityScan("com.codreal.chatservice.model")
@EnableJpaRepositories(basePackages="com.codreal.chatservice.repository")
public class ChatService {

	public static void main(String[] args) {
		SpringApplication.run(ChatService.class, args);
	}

}

