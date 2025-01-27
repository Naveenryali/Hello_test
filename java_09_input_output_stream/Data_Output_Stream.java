package java_09_input_output_stream;


import java.io.*;

public class Data_Output_Stream {

	public static void main(String[] args) throws Exception {
		
	     FileOutputStream file = new FileOutputStream("D:\\\\testout.txt");  
	        DataOutputStream data = new DataOutputStream(file);  
	        data.writeInt(65);  
	        data.flush();  
	        data.close();  
	        System.out.println("Succcess...");  
	}
}
