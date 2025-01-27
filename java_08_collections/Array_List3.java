package java_08_collections;

import java.util.ArrayList;

public class Array_List3 {

	public static void main(String[] args) {
		ArrayList<String> list=new ArrayList<String>();
		
		list.add("Apple");
		list.add("Banana");
		list.add("Orange");
		list.add("Grape");
		for(String fruit:list)
		{
			System.out.println(fruit);
		}
	}
}
