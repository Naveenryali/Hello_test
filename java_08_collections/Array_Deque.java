package java_08_collections;

import java.util.ArrayDeque;


public class Array_Deque {

	public static void main(String[] args) {
		
		ArrayDeque<String> dq=new ArrayDeque<String>();
		
		dq.add("Naveen");
		dq.add("Sai");
		dq.add("Venkat");
		
		for(String s:dq)
		{
			System.out.println(s);
		}
				
		
	}
}
