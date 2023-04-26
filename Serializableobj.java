package Serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Serializableobj {

	public static void main(String[] args) {
		
		Car c1= new Car(101,"Buggati");
		try {
			FileOutputStream fs = new FileOutputStream("C:\\Users\\Admin\\Documents\\student.ser");
			ObjectOutputStream ois = new ObjectOutputStream(fs);

			ois.writeObject(c1);
			System.out.println("Car ID: " + c1.Car_name);
			System.out.println("Car Name: " + c1.cid);
			ois.close();
		} catch (Exception e) {
			System.out.println(e);
			e.printStackTrace();
		}
	}

}
