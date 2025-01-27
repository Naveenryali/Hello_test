package java_09_input_output_stream;

import java.io.FileInputStream;
import java.io.SequenceInputStream;
import java.util.Enumeration;
import java.util.Vector;

public class Sequence_Input_Stream_Ene
{
	public static void main(String[] args) throws Exception {
		
	
	FileInputStream F1=new FileInputStream("/home/miracle/Transformers/Transformers");
	FileInputStream F2=new FileInputStream("/home/miracle/Desktop/mini/practice/style.css");
	FileInputStream F3=new FileInputStream("/home/miracle/sai/v.html");
	
	Vector<FileInputStream> v= new Vector<FileInputStream>();
	v.add(F1);
	v.add(F2);
	v.add(F3);
	
	Enumeration<FileInputStream> e= v.elements();
	
	SequenceInputStream sin= new SequenceInputStream(e);
	
	int i;
	
	while((i=sin.read())!=-1)
	{
		System.out.print((char)i);
	}
	sin.close();
	
}

}
