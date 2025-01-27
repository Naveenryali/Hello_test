package java_08_collections;

import java.util.HashSet;
import java.util.Iterator;

public class Hasset_ {

	public static void main(String[] args) {
		
		HashSet<String> set=new HashSet<String>();
		
		set.add("Naveen");
		set.add("Sai");
		set.add("Venkat");
		
		Iterator <String> itr=set.iterator();
		
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
	} 
	
}
