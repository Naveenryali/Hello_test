package java_08_collections;

import java.util.*;

public class Array_List6 {
public static void main(String[] args) {
	
	ArrayList<String>list=new ArrayList<String>();
	list.add("Sai");
	list.add("Venkat");
	list.add("Naveen");
	list.add("Vasu");
	
	System.out.println("Traversing list through list iterator:");
	
	ListIterator<String>list1=list.listIterator(list.size());
	while(list1.hasPrevious())
	{
		String str=list1.previous();
		System.out.println(str); 
		
	}
	
	System.out.println("Traversing list through for loop:");
	
	for(int i=0;i<list.size();i++)
	{
		System.out.println(list.get(i));
	}
	
	System.out.println("Traversing list through forEach() method:");
	
	list.forEach(a->
	System.out.println(a));
	
	System.out.println("Traversing list through forEachRemaining() method:");
	
	Iterator<String> itr=list.iterator();
	
	itr.forEachRemaining(a->
	{
		System.out.println(a);
	});
	
	
}
}
