package com.jsuryakt.learningSpring;

import com.jsuryakt.learningSpring.enumeration.Status;
import com.jsuryakt.learningSpring.model.Server;
import com.jsuryakt.learningSpring.repo.ServerRepo;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class LearningSpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(LearningSpringApplication.class, args);
	}

//	@Bean
//	CommandLineRunner run(ServerRepo serverRepo) {
//		return args -> {
//			serverRepo.save(new Server(null, "192.168.1.1", "Jio Fiber", "1GB", "Router", Status.SERVER_DOWN));
//		};
//	}
}
