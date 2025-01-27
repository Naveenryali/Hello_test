package java_10_serialization;

import java.util.Iterator;
import java.util.TreeSet;

public class Serilization1 {

	public static void main(String[] args) {
		
		TreeSet<student> l=new TreeSet<>();
		
		l.add(new student(30,"Sai"));
		l.add(new student(20,"Naveen"));
		l.add(new student(22,"Sai"));
		

		Iterator<student> itr=l.iterator();
		
		while(itr.hasNext())
		{
			student s=(student)itr.next();
			
			System.out.println(s.id+" "+s.name);
			
		}
		

	}
}
