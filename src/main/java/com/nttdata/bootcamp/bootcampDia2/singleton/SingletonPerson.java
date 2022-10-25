package com.nttdata.bootcamp.bootcampDia2.singleton;

public class SingletonPerson {

	private static SingletonPerson instance;
	public String name;
	public int age;

	public SingletonPerson(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	public static SingletonPerson getInstance(String name, int age) {
		if (instance == null) {
			instance = new SingletonPerson(name, age);
		}
		return instance;
	}

	public void singletonOperation() {
		System.out.println("Hola. Soy " + name + " . Tengo " + age + " años.");
	}
}
