package com.example.spring_data_jdbc;

import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.time.LocalDate;

@SpringBootApplication
public class SpringDataJdbcApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringDataJdbcApplication.class, args);
	}

	@Bean
	ApplicationRunner applicationRunner(PetRepository petRepository)
	{
		return args -> {
			Pet pet1 = Pet.create("zuk", LocalDate.of(2014,4,30));
			Pet pet2 = Pet.create("dymko", LocalDate.of(2020,2,3));

			System.out.println(petRepository.save(pet1));
			System.out.println(petRepository.save(pet2));

			System.out.println(petRepository.findByName("dymko"));

		};
	}
}
