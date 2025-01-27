package java_08_collections;

import java.util.*;

public class Array_List2 {

	public static void main(String[] args) {
		
		ArrayList<String> list=new ArrayList<String>();
		list.add("Naveen");
		list.add("Sai");
		list.add("Venkat");
		
		Iterator<String> itr=list.iterator();
		
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
	}
}
