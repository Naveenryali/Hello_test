package java_09_input_output_stream;

import java.io.*;

public class Buffered_Input_Stream {

	public static void main(String[] args) throws IOException {
		
		FileInputStream fin=new FileInputStream("/home/miracle/Desktop/mini/practice/style.css");
		BufferedInputStream bin=new BufferedInputStream(fin);
		
		int i;
		
		while((i=bin.read())!=-1)
		{
			System.out.print((char)i);
		}
		bin.close();
		
	}
}
