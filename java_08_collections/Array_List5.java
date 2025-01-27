package java_08_collections;

import java.util.*;

public class Array_List5 {

	public static void main(String[] args) {
		ArrayList<String> list=new ArrayList<String>();
		
		list.add("Apple");
		list.add("Banana");
		list.add("Orange");
		list.add("Grape");
		Collections.sort(list);
		
		for(String fruit:list)
		{
			System.out.println(fruit);
		}
		System.out.println("Sorting numbers...");
		List<Integer>list1=new ArrayList<Integer>();
		
		list1.add(22);
		list1.add(55);
		list1.add(66);
		list1.add(12);
		Collections.sort(list1);
		for(Integer number:list1)
		{
			System.out.println(number);
		}
		
		
	}
}
