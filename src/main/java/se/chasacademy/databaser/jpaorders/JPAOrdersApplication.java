package se.chasacademy.databaser.jpaorders;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JPAOrdersApplication implements CommandLineRunner {

	public JPAOrdersApplication() {
	}

	public static void main(String[] args) {
		SpringApplication.run(JPAOrdersApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

	}
}
