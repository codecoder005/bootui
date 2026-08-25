package com.popcorn.bootui;

import com.popcorn.bootui.entity.UserEntity;
import com.popcorn.bootui.reposiroty.UserRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class BootUIApplication {

	static void main(String[] args) {
		SpringApplication.run(BootUIApplication.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner(UserRepository userRepository) {
		return args -> {
			UserEntity john = UserEntity.builder().name("John Doe").email("john.doe@example.com").build();
			userRepository.saveAndFlush(john);
		};
	}

}
