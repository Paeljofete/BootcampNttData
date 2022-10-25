package com.nttdata.bootcamp.bootcampDia2.builder;

public class Person {

	private String nid;
	private String name;
	private String surname;
	private String tel;
	private String adress;
	
	public Person() {
		super();
	}
	
	Person(PersonBuilder builder){
		this.nid = builder.getNid();
		this.name = builder.getName();
		this.surname = builder.getSurname();
		this.tel = builder.getSurname();
		this.adress = builder.getAdress();
	}
}
