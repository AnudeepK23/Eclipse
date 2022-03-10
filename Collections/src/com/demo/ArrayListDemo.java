package com.demo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListDemo {

	public static void main(String[] args) {
		

		List returnedArrayList = new ArrayListDemo().createArrayListForDemo();
		new ArrayListDemo().printArrayListForDemo(returnedArrayList);
	}
	
	private List createArrayListForDemo() {
		List<String> cars = new ArrayList<>();
		cars.add("BMW");
		cars.add("Benz");
		cars.add("Swift");
		cars.add("Audi");
		cars.add("Mahindra");
		cars.add("Swift");
		
		return cars;
	}
	
	private void printArrayListForDemo(List list) {
		Iterator listIterator  = list.iterator();
		while(listIterator.hasNext()) {
			System.out.println("Print the value in list : " +listIterator.next());
			
			
		}
		
	}

}
