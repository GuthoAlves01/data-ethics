package br.unitins.dataethics;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication(exclude = { SecurityAutoConfiguration.class })
public class DataethicsApplication {

	public static void main(String[] args) {
		SpringApplication.run(DataethicsApplication.class, args);
	}

}
