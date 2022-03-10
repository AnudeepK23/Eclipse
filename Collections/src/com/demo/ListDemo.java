package com.demo;

import java.util.ArrayList;
import java.util.Iterator;



class Student{
	int roll;
	String name;
}

public class ListDemo {

	public static void main(String[] args) {

		//list1 can store only String Objects
		ArrayList<String> list1 = new ArrayList<String>();
		
		//list2 can store any type of objects
		ArrayList list2 = new ArrayList();
		
		Student s1 = new Student();
		s1.roll = 98;
		s1.name = "Anudeep";
		
		//1. Add Data in list
		
		list1.add("Radhe"); //0
		list1.add("Shyam"); //1
		list1.add("Ram"); //2
		list1.add("Bheem"); //3
		list1.add("Beemla"); //4
		list1.add("Radhe"); //5
		list1.add("Daniel"); //6
		
//		list1.add(10); //error
//		list1.add(3.1); //error
		
		
		list2.add(45);
		list2.add('A');
		list2.add(4.5);
		list2.add(s1);
		
		//Print reference to list ==> shall print elements in the list the way we added in a sequence
		
		System.out.println("List 1 elements : " +list1);
		System.out.println("List2 elements : " +list2);
		
		//2. Get the element from list
		String name = list1.get(2);
		System.out.println("Name is : " +name);
		
		Object o = list2.get(2);
		System.out.println(" Object is : " +o);
		
		//3. Update Element in List
		list1.set(3, "Acharya");
		System.out.println("List 1 now is : "+list1);
		
		//4. Remove Element from list
		list1.remove(1);
		System.out.println("List1 after remove is : "+list1);
		
		//5.To remove all
		
//		list1.clear();
//		System.out.println("List1 after removed all is : "+list1);
		
		//6.Iterate in ArrayList
		
		System.out.println("========Iterating with For Loop===============");
		for(int i=0;i<list1.size();i++) {
			System.out.println(list1.get(i));
		}
		System.out.println("=======================================");

		System.out.println("========Iterating with Enhanced For Loop===============");
		for(String str : list1) {
			System.out.println(str);
		}
		System.out.println("=======================================");
		
		
		System.out.println("========Iterating with Iterator===============");
		Iterator<String> itr = list1.iterator();
		
		//Iterating each line separetely
		
//		System.out.println(itr.next());
//		System.out.println(itr.next());
//		System.out.println(itr.next());
//		System.out.println(itr.next());
		
		
		//Iterating all elements together
		
		while(itr.hasNext()) {
			String str = itr.next();
			System.out.println(str);
			
			///To remove particular element and print list
			if(str.equals("Beemla")) {
				itr.remove();
			}
		}
		System.out.println("========================");
		
		System.out.println("List1 After iteration is : "+list1);
	}

}
