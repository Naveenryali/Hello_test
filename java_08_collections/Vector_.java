package java_08_collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Vector;

public class Vector_ {

	public static void main(String[] args) {
		
		ArrayList<String> a=new ArrayList<>();
		
		a.add("Hari");
		a.add(0,"Ramesh");
		System.out.println(a.size());
		System.out.println(a);
		
		
		Vector<String> v=new Vector<String>();
		
		v.add("Naveen");
		v.add("Sai");
		v.add("Venkat");
		v.add("Naveen");
		v.add("Sai");
		v.add("Venkat");
		v.add("Naveen");
		v.add("Sai");
		v.add("Venkat");
		
		
		Iterator<String> itr=v.iterator();
		
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		System.out.println(v);
		
		
		for(int i=0;i<v.size();i++)
		{
			System.out.println(v.get(i));
		}
		v.addAll(a);
		System.out.println(v);
		System.out.println(v.containsAll(a));
		System.out.println(v.size());
		System.out.println(v.capacity());
		
	}
}
