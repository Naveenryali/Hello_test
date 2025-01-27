package java_08_collections;

import java.util.Iterator;
import java.util.TreeSet;

public class Tree_set {

	public static void main(String[] args) {
		
		TreeSet<String> set=new TreeSet<String>();
		
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
