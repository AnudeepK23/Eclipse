package com.abs;

public abstract class Shape {
	
	abstract float area();
	
	public void displayArea(float area) {
		System.out.println(" Printing area of Shape : " +area);
	}

}
