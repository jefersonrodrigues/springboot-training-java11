package com.rodrigues.jeferson.basic.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.rodrigues.jeferson.basic.entities.User;
import com.rodrigues.jeferson.basic.repositories.UserRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {
	
	@Autowired
	private UserRepository userRepository;

	@Override
	public void run(String... args) throws Exception {
		
		User u1 = new User(null, "Maria Brown", "maria@gmail.com", "98888888", "123456");
		User u2 = new User(null, "João Grey", "joao@gmail.com", "911111111", "654321");
		
		userRepository.saveAll(Arrays.asList(u1, u2));
	}
	
}
