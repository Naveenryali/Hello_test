package java_10_serialization;

import java.io.*;
import java.util.Iterator;
import java.util.TreeSet;

public class Deserialization {

	public static void main(String[] args) throws Exception {
		
		FileInputStream fin=new FileInputStream("/home/miracle/Documents/serialization");
		ObjectInputStream oin=new ObjectInputStream(fin);
		
		@SuppressWarnings("unchecked")
		TreeSet<student> s=(TreeSet<student>) oin.readObject();
		Iterator<student> i=s.iterator();
		while(i.hasNext())
		{
			student s1=(student)i.next();
		System.out.println(s1.id+" "+s1.name);
		}
		oin.close();
		
	}
}
