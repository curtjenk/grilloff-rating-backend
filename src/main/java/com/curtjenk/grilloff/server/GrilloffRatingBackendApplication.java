package com.curtjenk.grilloff.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication(scanBasePackages = {"com.curtjenk.grilloff.server"})
@EnableJpaAuditing
public class GrilloffRatingBackendApplication {

	public static void main(String[] args) {
		SpringApplication.run(GrilloffRatingBackendApplication.class, args);
	}
}
