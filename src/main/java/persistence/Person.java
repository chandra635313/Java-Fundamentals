package persistence;

import java.io.Serializable;

public class Person implements Serializable {

	private static final long serialVersionUID = 1L;
	String name;
	String address;
	int phone;

	public Person(String name, String address, int phone) {
		this.name = name;
		this.address = address;
		this.phone = phone;
	}
}
