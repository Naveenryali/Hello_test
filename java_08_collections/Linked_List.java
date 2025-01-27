package java_08_collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;

public class Linked_List {

	public static void main(String[] args) {
		
		ArrayList<String> al=new ArrayList<>();
		
		al.add("Hari");
        al.add("Ramesh");
        al.add("Suresh");
        
		LinkedList<String> list=new LinkedList<>(Arrays.asList());
		
		list.add("Naveen");
		list.add("Sai");
		list.add("Venkat");
		list.addAll(al);
		
		Iterator<String> itr=list.iterator();
		
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
	}
}
