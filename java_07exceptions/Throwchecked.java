package java_07exceptions;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Throwchecked {
	
	public static void method()throws FileNotFoundException{
		
		  FileReader file = new FileReader("C:\\Users\\Anurati\\Desktop\\abc.txt");  
	        BufferedReader fileInput = new BufferedReader(file); 
	        System.out.println(fileInput);
	        throw new FileNotFoundException();
	}

	
	public static void main(String[] args) {
		
		try
		{
			method();
		}
		catch(FileNotFoundException e)
		{
			e.printStackTrace();
		}
		System.out.println("Code");
		
	}
}
