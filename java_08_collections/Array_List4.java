package java_08_collections;

import java.util.ArrayList;

public class Array_List4 {
public static void main(String[] args) {
	// using get()and set()method
	
	
	ArrayList<String> list=new ArrayList<String>();
	
	list.add("Apple");
	list.add("Banana");
	list.add("Orange");
	list.add("Grape");
	System.out.println("Returning element"+list.get(1));
	list.set(0, "Dates");
	
	for(String fruit:list)
	{
		System.out.println(fruit);
	}
}
}
