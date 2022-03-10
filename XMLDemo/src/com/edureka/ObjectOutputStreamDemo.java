package com.edureka;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class ObjectOutputStreamDemo {

	public static void main(String[] args) throws IOException {
		VehicleInfo bmw = new VehicleInfo("BMW", 4, 10);
		new ObjectOutputStreamDemo().Serialize(new File("C:\\Users\\anudeep_krishnareddy\\eclipse-workspace\\XMLEdureka\\SerializabelFile.bin"),bmw);

	}
	private void Serialize(File file , VehicleInfo instanceOfVehicleInfo) throws IOException {
		FileOutputStream fileStream = new FileOutputStream(file);
		ObjectOutputStream objectStream = new ObjectOutputStream(fileStream);
		objectStream.writeObject(instanceOfVehicleInfo);
		objectStream.flush();
		objectStream.close();
	}

}
