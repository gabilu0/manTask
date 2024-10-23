package com.mantask.mantask_api;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MantaskApplication {

	private static final Logger LOGGER = LoggerFactory.getLogger(MantaskApplication.class);
	
	public static void main(String[] args) {
		LOGGER.info("Start service");
		SpringApplication.run(MantaskApplication.class, args);
	}

}
