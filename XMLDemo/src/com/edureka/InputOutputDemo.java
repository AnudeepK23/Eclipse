package com.edureka;

//import java.io.File;
//import java.io.FileNotFoundException;
//import java.io.PrintWriter;
import java.io.*;
import java.util.Scanner;

public class InputOutputDemo {

	public static void main(String[] args) throws FileNotFoundException {
		File employeeInfoFile = new File("C:\\Users\\anudeep_krishnareddy\\eclipse-workspace\\XMLEdureka\\EmployeeInfo.txt");
		InputOutputDemo demo = new InputOutputDemo();
		demo.writeToFile(employeeInfoFile);
		
		
		File vehicleInfoFile = new File("C:\\Users\\anudeep_krishnareddy\\eclipse-workspace\\XMLEdureka\\VehicleInfo.txt");
		demo.readToFile(vehicleInfoFile);

	}
	
	public void writeToFile(File fileToWrite) {
		PrintWriter employeeInfoWriter = null;
		try {
			employeeInfoWriter = new PrintWriter(fileToWrite);
			employeeInfoWriter.println("Anudeep");
			employeeInfoWriter.println("23");
			
		}catch(FileNotFoundException e) {
			System.out.println("Give file was not found in local disk " +fileToWrite.getName());
			throw new RuntimeException(e);
		}finally {
			employeeInfoWriter.close();
		}
		
		
	}
	
	public void readToFile(File fileToRead) throws FileNotFoundException {
		Scanner input = new Scanner(fileToRead);
		while(input.hasNext()) {
			System.out.println("Line Read from Input file : "+input.nextLine());
		}
	}

}


