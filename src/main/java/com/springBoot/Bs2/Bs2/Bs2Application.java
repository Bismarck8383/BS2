package com.springBoot.Bs2.Bs2;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Bs2Application {

	public static void main(String[] args) {
		SpringApplication.run(Bs2Application.class, args);
	}

	@Bean
	@Qualifier("standardBean")
	public PersonaServices getPerson() {
		PersonaServices personService = new PersonaImplementacion();
		return personService;
	}

	@Bean
	@Qualifier("bean1")
	public PersonaServices getPersonBean1() {
		PersonaServices personService = new PersonaImplementacion();
		personService.setNombre("bean1");
		return personService;
	}

	@Bean
	@Qualifier("bean2")
	public PersonaServices getPersonBean2() {
		PersonaServices personService = new PersonaImplementacion();
		personService.setNombre("bean2");
		return personService;
	}

	@Bean
	@Qualifier("bean3")
	public PersonaServices getPersonBean3() {
		PersonaServices personService = new PersonaImplementacion();
		personService.setNombre("bean3");
		return personService;
	}

}
