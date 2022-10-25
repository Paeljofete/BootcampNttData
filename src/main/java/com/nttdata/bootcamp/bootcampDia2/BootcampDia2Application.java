package com.nttdata.bootcamp.bootcampDia2;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.nttdata.bootcamp.bootcampDia2.builder.Person;
import com.nttdata.bootcamp.bootcampDia2.builder.PersonBuilder;
import com.nttdata.bootcamp.bootcampDia2.singleton.SingletonPerson;

@SpringBootApplication
public class BootcampDia2Application implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(BootcampDia2Application.class, args);

		SingletonPerson singleton = SingletonPerson.getInstance("Patricia", 37);

		singleton.singletonOperation();

		Person person = new PersonBuilder().nid("1234567K").name("Beren", "Sánchez").tel("123456789")
				.adress("C/ Bécquer, 200").build();
		
		System.out.println("Mi hijo es: " + person + ".");
	}

	public void run(String... args) throws Exception {
	}

}
