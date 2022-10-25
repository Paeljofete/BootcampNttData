package com.nttdata.bootcamp.bootcampDia2;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.nttdata.bootcamp.bootcampDia2.singleton.SingletonPerson;

@SpringBootApplication
public class BootcampDia2Application implements CommandLineRunner
{

	public static void main(String[] args) {
		SpringApplication.run(BootcampDia2Application.class, args);
		
        SingletonPerson singleton = SingletonPerson.getInstance("Patricia", 37);
        
        singleton.singletonOperation();
	}

	public void run(String... args) throws Exception {	
	}

}
