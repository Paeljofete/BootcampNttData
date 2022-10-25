package com.nttdata.bootcamp.bootcampDia2.builder;

public class PersonBuilder {

	private String nid;
	private String name;
	private String surname;
	private String tel;
	private String adress;

	public PersonBuilder() {
	}

	public PersonBuilder nid(String nid) {
		this.nid = nid;
		return this;
	}

	public PersonBuilder name(String name, String surname) {
		this.name = name;
		this.surname = surname;
		return this;
	}

	public PersonBuilder tel(String tel) {
		this.tel = tel;
		return this;
	}

	public PersonBuilder adress(String adress) {
		this.adress = adress;
		return this;
	}

	public Person build() {
		return new Person(this);
	}

	public String getNid() {
		return nid;
	}

	public void setNid(String nid) {
		this.nid = nid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public String getAdress() {
		return adress;
	}

	public void setAdress(String adress) {
		this.adress = adress;
	}
}
