package java_08_collections;

import java.util.*;

public class Array_List1 {

	public static void main(String[] args) {
		
		ArrayList<String> list =new ArrayList<String>();
		
		list.add("Naveen");
		list.add("Venkat");
		list.add(0,"Sai");
		
		
		for (String string : list) {
			System.out.println(string);
			
		}
		
		Iterator<String> itr=list.iterator();
		
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		System.out.println(list.size());
		
		for(int i=0;i<list.size();i++)
		{
			System.out.println(list.get(i));
		}	
	}
}
