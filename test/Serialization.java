package test;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;

class Student implements Serializable
{
	private static final long serialVersionUID = 1L;
	int id;
	String name;
	public Student(int id,String name)
	{
		this.id=id;
		this.name=name;
	}
	public int getId()
	{
		return id;
	}
	public String getName()
	{
		return name;
	}
}
public class Serialization {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
		ArrayList<Student> al=new ArrayList<>();
		
		al.add(new Student(1,"Naveen"));
		al.add(new Student(2,"Sai"));
		al.add(new Student(3,"Vasu"));
		
		FileOutputStream fos=new FileOutputStream("./stream.txt");
		
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		
		oos.writeObject(al);
		
		FileInputStream fis= new FileInputStream("./stream.txt");
		
		ObjectInputStream ois=new ObjectInputStream(fis);
		
		@SuppressWarnings("unchecked")
		ArrayList<Student> s=(ArrayList<Student>)ois.readObject();
		
		Iterator<Student> itr= s.iterator();
		
		while(itr.hasNext())
		{
			Student s1=(Student)itr.next();
			System.out.println(s1.id+" "+s1.name);
			System.out.println(s1.getId()+" "+s1.getName());
			
		}
		ois.close();
		oos.close();
		
		
	}
	
}
