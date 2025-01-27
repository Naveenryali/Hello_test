package java_09_input_output_stream;

import java.io.*;

public class Buffered_output_Stream {

	public static void main(String[] args) throws Exception{
		
		FileOutputStream fout=new FileOutputStream("/home/miracle/Desktop/mini/practice/style.css");
		
		BufferedOutputStream Bout=new BufferedOutputStream(fout);
		String s="Hello Java t point";
		
		byte b[]=s.getBytes();
		Bout.write(b,5,s.length()-5);
		Bout.flush();
		
		Bout.close();
		fout.close();
		System.out.println("Success");
		
		
		
	}
}
