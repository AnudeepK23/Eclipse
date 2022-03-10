package com.edureka;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamDemo {

	public static void main(String[] args) throws IOException {
		
		FileInputStreamDemo fileInputStreamDemo = new FileInputStreamDemo();
		fileInputStreamDemo.readFromFile("C:\\Users\\anudeep_krishnareddy\\eclipse-workspace\\XMLEdureka\\VehicleInfo.txt");
		

	}
	
	private void readFromFile(String fileToRead) throws IOException {
		FileInputStream inputStream = new FileInputStream(fileToRead);
		int integerReadFromFile;
		while((integerReadFromFile = inputStream.read())!=-1) {
			System.out.println("Character from Input File is : " +integerReadFromFile);
		}
		inputStream.close();
	}

}
