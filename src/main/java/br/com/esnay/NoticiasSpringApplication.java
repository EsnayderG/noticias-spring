package br.com.esnay;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import lombok.AllArgsConstructor;

@SpringBootApplication
@AllArgsConstructor
public class NoticiasSpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(NoticiasSpringApplication.class, args);
	}
}
