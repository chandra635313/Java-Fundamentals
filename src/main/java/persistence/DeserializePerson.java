package persistence;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeserializePerson {

	public static void main(String[] args) {
		Person person;
		try {
			FileInputStream fileIn = new FileInputStream("./src/main/resources/person.ser");
			ObjectInputStream in = new ObjectInputStream(fileIn);
			person = (Person) in.readObject();
			in.close();
			fileIn.close();
		} catch (IOException e) {
			e.printStackTrace();
			return;
		} catch (ClassNotFoundException c) {
			c.printStackTrace();
			return;
		}

		System.out.println("Deserialized Object:");
		System.out.println("Name: " + person.name);
		System.out.println("Address: " + person.address);
		System.out.println("Phone: " + person.phone);
	}
}
