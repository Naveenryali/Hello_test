package java_09_input_output_stream;

import java.io.*;

public class Sequence_Input_Output_Stream {

	public static void main(String[] args) throws Exception {
		
		FileInputStream fin1=new FileInputStream("/home/miracle/Desktop/vivo/oppo");    
		   FileInputStream fin2=new FileInputStream("/home/miracle/Desktop/vivo/specifications");    
		   FileOutputStream fout=new FileOutputStream("/home/miracle/Desktop/stream");      
		   SequenceInputStream sis=new SequenceInputStream(fin1,fin2);    
		   int i;    
		   while((i=sis.read())!=-1)    
		   {    
		     fout.write(i);        

		   }    
		   sis.close();    
		   fout.close();      
		   fin1.close();      
		   fin2.close();       
		   System.out.println("Success..");  
	}
}
