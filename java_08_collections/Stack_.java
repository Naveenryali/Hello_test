package java_08_collections;

import java.util.Iterator;
import java.util.Stack;

public class Stack_ {

	public static void main(String[] args) {
		
		Stack<String> s=new Stack<String>();
		
		s.push("Volvo");
		s.push("BMW");
		s.push("TATA");
		
		System.out.println(s);
		
		Iterator <String> itr=s.iterator();
		
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		s.peek();
		System.out.println(s);
		s.pop();
		System.out.println(s);
		
		System.out.println(s.search("Volvo "));
		 
	}
}
