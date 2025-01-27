package java_08_collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Practice {
	
	public static void main(String[] args) {
		
		
		List<Integer> l=new ArrayList<>();
		
		l.add(101);
		l.add(102);
		l.add(103);
		l.add(104);l.add(105);
		l.add(106);
		
		System.out.println(l);
		
		Iterator<Integer> itr = l.iterator();
		
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		for(Integer li:l)
		{
			System.out.println(li);
		}
		
	}

}
