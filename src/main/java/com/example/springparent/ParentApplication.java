package com.example.springparent;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication

public class ParentApplication {
private Logger logger = LoggerFactory.getLogger(ParentApplication.class);
	public static void main(String[] args) {

		SpringApplication.run(ParentApplication.class, args);
		logger.info("Parent application started");
	}

}
