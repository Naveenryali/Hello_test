package java_08_collections;

import java.util.*;
import java.util.Deque;
import java.util.Iterator;


public class Priority_Queue {

	public static void main(String[] args) {
		
		Deque<String> q=new ArrayDeque<String>();
		
		q.add("Naveen");
		q.offer("Sai");
		q.add("Venkat");
		q.offerFirst("Ravi");
		
		System.out.println("head:"+q.element());
		System.out.println("head:"+q.peek());
		System.out.println("iterrating the queue elements");
		
		Iterator<String> itr=q.iterator();
		
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		System.out.println(q);
		q.remove();
		q.poll();
		System.out.println(q);
		System.out.println("after removing two elements");
		
		Iterator<String> itr2=q.iterator();
		
		while(itr2.hasNext())
		{
			System.out.println(itr2.next());
		}
		
		while(q.isEmpty())
		{
			System.out.println(q.peek());
		}
		System.out.println(q);
			
	}
}
