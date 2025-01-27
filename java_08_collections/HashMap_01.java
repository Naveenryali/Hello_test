package java_08_collections;

import java.util.*;
import java.util.Map.Entry;

public class HashMap_01 {

	public static void main(String[] args) {
		
		
//		Java HashMap contains values based on the key.
//		Java HashMap contains only unique keys.
//		Java HashMap may have one null key and multiple null values.
//		Java HashMap is non synchronized.
//		Java HashMap maintains no order.
//		The initial default capacity of Java HashMap class is 16 with a load factor of 0.75.

		
		Map<Integer, String> map=new HashMap<Integer, String>();
		
		map.put(1, "Ravi");
		map.put(3,"Ajay");
		map.put(5, "Sai");
		map.put(4, "Hari");
		
		Set<Integer> set=map.keySet();
		Collection<String> s=map.values();
		Iterator<Integer> itr=set.iterator();
		Iterator<String> i=s.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
		
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		Set<Entry<Integer, String>> s1=map.entrySet();
		
		for(Entry<Integer,String> e :s1)
		{
			//System.out.println(e.equals(i));
			System.out.println(e.getKey()+">>>>"+e.getValue());
		}
		
		
		
		
	}
	
}
