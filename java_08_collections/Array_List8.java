package java_08_collections;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.*;

public class Array_List8 {

	public static void main(String[] args) {
		
		ArrayList<String> al=new ArrayList<String>();
		al.add("Naveen");
		al.add("Sai");
		al.add("Ajay");
		try
		{
			//serialization
			FileOutputStream fos=new FileOutputStream("file");
			ObjectOutputStream oos=new ObjectOutputStream(fos);
			oos.writeObject(al);
			fos.close();
			oos.close();
			//Deserialization
			FileInputStream fis=new FileInputStream("file");
			ObjectInputStream ois=new ObjectInputStream(fis);
			ArrayList<?> list=(ArrayList<?>)ois.readObject();
			System.out.println(list);
			fis.close();
			ois.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
	}
}
