package java_10_serialization;

import java.io.*;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;


class Save implements Serializable
{
	private static final long serialVersionUID = 1L;
	int i;
}

public class Serial01 {
	public static void main(String[] args) throws Exception {
		
		Save obj= new Save();
		
		obj.i=4;
		
		File f=new File("obj.txt");
		
		FileOutputStream fos=new FileOutputStream(f);
		
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		
		oos.writeObject(obj);
		System.out.println("Success");
		
		FileInputStream fis=new FileInputStream(f);
		
		ObjectInputStream ois= new ObjectInputStream(fis);
		
		
		Save obj1=(Save)ois.readObject();
		
		System.out.println("Value of i : "+obj1.i);
		oos.close();
		ois.close();
	
	}
}
