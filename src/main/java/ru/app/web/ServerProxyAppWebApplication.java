package ru.app.web;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "ru.app")
public class ServerProxyAppWebApplication implements CommandLineRunner {

	private static final Logger logger = LogManager.getLogger(ServerProxyAppWebApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(ServerProxyAppWebApplication.class, args);
	}

	@Override
	public void run(String... arg0) throws Exception {
		logger.info("Server is ready to work.");
	}
}
