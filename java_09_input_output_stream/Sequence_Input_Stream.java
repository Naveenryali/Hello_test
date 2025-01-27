package java_09_input_output_stream;

import java.io.*;

public class Sequence_Input_Stream {

	public static void main(String[] args) throws Exception {
		
		FileInputStream F1=new FileInputStream("/home/miracle/Transformers/Transformers");
		FileInputStream F2=new FileInputStream("/home/miracle/Desktop/mini/practice/style.css");
		
		SequenceInputStream sin= new SequenceInputStream(F1,F2);
		
		int i;
		
		while((i=sin.read())!=-1)
		{
			System.out.print((char)i);
		}
		F2.close();
		sin.close();
		
	}
}
