package java_09_input_output_stream;

import java.io.*;

public class Data_Input_Stream {

	public static void main(String[] args) throws Exception {
		
		 InputStream input = new FileInputStream("D:\\testout.txt");  
		    DataInputStream inst = new DataInputStream(input);  
		    int count = input.available();  

		    byte[] ary = new byte[count];  
		    inst.read(ary);  
		    for (byte bt : ary) {  
		      char k = (char) bt;  
		      System.out.print(k+"-"); 
		      
		    }
		    inst.close();
	}
}
