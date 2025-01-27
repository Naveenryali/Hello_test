package java_08_collections;

import java.util.*;

public class HashMap_02 {

	public static void main(String[] args) {
		
		Map<Integer,String> map=new HashMap<Integer, String>();
		map.put(105, "Volvo");
		map.put(102, "Tata");
		map.put(109, "Benz");
		
		for(@SuppressWarnings("rawtypes") Map.Entry m:map.entrySet())
		{
			System.out.println(m.getKey()+" "+m.getValue());
		}
	}
}
