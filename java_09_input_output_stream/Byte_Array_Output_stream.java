package java_09_input_output_stream;

import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;

public class Byte_Array_Output_stream {

	public static void main(String[] args) throws Exception {
		
			FileOutputStream fo1=new FileOutputStream("/home/miracle/Desktop/hero/parts");
			FileOutputStream fo2=new FileOutputStream("/home/miracle/Desktop/hero/parts3");

			ByteArrayOutputStream bout =new ByteArrayOutputStream();
			
			bout.write(65);
			bout.writeTo(fo1);
			bout.writeTo(fo2);
			
			bout.flush();
			bout.close();
			System.out.println("Success");
		
	}
}
