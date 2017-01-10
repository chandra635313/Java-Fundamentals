package persistence;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializePerson {
	public static void main(String[] args) {
		Person person = new Person("Adam", "345 Street", 12345678);
		try {
			FileOutputStream fileOut = new FileOutputStream("./src/main/resources/person.ser");
			ObjectOutputStream out = new ObjectOutputStream(fileOut);
			out.writeObject(person);
			out.close();
			fileOut.close();
			System.out.printf("Serialized data is saved in person.ser");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
