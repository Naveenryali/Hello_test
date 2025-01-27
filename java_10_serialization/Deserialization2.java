package java_10_serialization;

import java.io.*;

public class Deserialization2 {

	public static void main(String[] args) throws Exception {
		
		FileInputStream fio=new FileInputStream("/home/miracle/Documents/serial");
		ObjectInputStream oin=new ObjectInputStream(fio);
		
		Person p=(Person)oin.readObject();
		System.out.println(p.getName()+" "+p.getAge());
		oin.close();
	}
}
