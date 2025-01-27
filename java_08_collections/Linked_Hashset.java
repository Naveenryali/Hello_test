package java_08_collections;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class Linked_Hashset {

	public static void main(String[] args) {
		
		LinkedHashSet<String> set=new LinkedHashSet<String>();
		
		set.add("Naveen");
		set.add("Sai");
		set.add("Venkat");
		
		Iterator<String> itr=set.iterator();
		
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
	
	}
}
